package edu.cornell.ksbclient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.kuali.rice.core.v2_0.ParameterService;
import org.kuali.rice.kew.v2_0.WorkflowDocumentActionsService;
import org.kuali.rice.kim.v2_0.IdentityService;
import org.kuali.rice.kim.v2_0.RoleService;
import org.kuali.rice.location.v2_0.CountryService;
import org.kuali.rice.location.v2_0.PostalCodeService;
import org.kuali.rice.location.v2_0.StateService;

public class KSBServiceClient {
  
	private static Properties properties = new Properties();
	
  private Map<String, Object> outProps = new HashMap<String, Object>();
  private String baseURL = "";
  private String signUser = "";
  private String signPropsFile = "";
  
	public KSBServiceClient(String signPropsFile, String signUser, String baseURL) {
	  this.baseURL = baseURL;
	  this.signUser = signUser;
	  this.signPropsFile = signPropsFile;
	  
    outProps.put( WSHandlerConstants.ACTION, KSBClientProperties.SIGNATURE_ACTION );
    outProps.put( WSHandlerConstants.USER, signUser );
    outProps.put( WSHandlerConstants.PW_CALLBACK_CLASS, KSBClientCallbackHandler.class.getName() );
    
    if (KSBClientProperties.DEFAULT_SIGNATURE_PROPERTIES_FILE.equals(signPropsFile)) {
      outProps.put( WSHandlerConstants.SIG_PROP_FILE,  signPropsFile);
    } else {
      loadCryptoProperties();
    }  
  }

  public KSBServiceClient() {
    this(KSBClientProperties.DEFAULT_SIGNATURE_PROPERTIES_FILE, KSBClientProperties.DEFAULT_SIGNATURE_USER, KSBClientProperties.DEFAULT_BASE_URL);
  }
	
  public ParameterService getParameterService () {
	  return getService(KSBClientProperties.PARAMETER_WSDL_LOCATION, KSBClientProperties.QNAME_PARM_SERVICE,
		  		KSBClientProperties.QNAME_PARM_SERVICE_PORT, ParameterService.class);
		
  }
  
  public RoleService getRoleService() {
	  return getService(KSBClientProperties.ROLE_WSDL_LOCATION, KSBClientProperties.QNAME_ROLE_SERVICE,
				  		KSBClientProperties.QNAME_ROLE_SERVICE_PORT, RoleService.class);

  }

  public IdentityService getIdentityService() {
	  return getService(KSBClientProperties.IDENTITY_WSDL_LOCATION, KSBClientProperties.QNAME_IDENTITY_SERVICE,
		  		KSBClientProperties.QNAME_IDENTITY_SERVICE_PORT, IdentityService.class);
  }
  
  public WorkflowDocumentActionsService getWorkflowDocumentActionsService() {
	  return getService(KSBClientProperties.WORKFLOW_ACTION_WSDL_LOCATION, KSBClientProperties.QNAME_WORKFLOW_ACTION_SERVICE,
		  		KSBClientProperties.QNAME_WORKFLOW_ACTION_SERVICE_PORT, WorkflowDocumentActionsService.class);
  }
  
  public CountryService getCountryService() {
	  return getService(KSBClientProperties.COUNTRY_WSDL_LOCATION, KSBClientProperties.QNAME_COUNTRY_SERVICE,
		  		KSBClientProperties.QNAME_COUNTRY_SERVICE_PORT, CountryService.class);
  }
  
  public PostalCodeService getPostalCodeService() {
	  return getService(KSBClientProperties.POSTAL_WSDL_LOCATION, KSBClientProperties.QNAME_POSTAL_SERVICE,
		  		KSBClientProperties.QNAME_POSTAL_SERVICE_PORT, PostalCodeService.class);
  }
  
  public StateService getStateService() {
	  return getService(KSBClientProperties.STATE_WSDL_LOCATION, KSBClientProperties.QNAME_STATE_SERVICE,
		  		KSBClientProperties.QNAME_STATE_SERVICE_PORT, StateService.class);
  }
  
  private <T> T getService(String wsdlocation, QName tService, QName tServicePort, Class<T> serviceEndpointInterface) {
	  GenericServiceImpl svc;
	  try {
		  svc = new GenericServiceImpl(new URL(baseURL + wsdlocation), tService);
		  T service =  (T) svc.getPort(tServicePort, serviceEndpointInterface);
		  
		  setWSS4JOutInterceptor(service);
		  return service; 
	  } catch (MalformedURLException e) {
	      System.err.println("Invalid URL: " + baseURL);
	      return null;
	}

  }
  
  public static String getProperty(String key) {
    return properties.getProperty(key);
  }
  
  public String getBaseURL() {
    return baseURL;
  }

  public void setBaseURL(String baseURL) {
    this.baseURL = baseURL;
  }

  public String getSignUser() {
    return signUser;
  }

  public void setSignUser(String signUser) {
    this.signUser = signUser;
    outProps.remove( WSHandlerConstants.USER);
    outProps.put( WSHandlerConstants.USER, signUser );
  }

  public String getSignPropsFile() {
    return signPropsFile;
  }

  public void setSignPropsFile(String signPropsFile) {
    this.signPropsFile = signPropsFile;
    
    outProps.remove("crypto_properties");
    outProps.remove(WSHandlerConstants.SIG_PROP_REF_ID);
    loadCryptoProperties();
  }
  
  private void loadCryptoProperties() {
    //Since we are using a properties file that is out of the class path
    //we need to load it then stuff the ref into our WSS4J outbound
    //properties
    try {
      properties.load(new FileInputStream(signPropsFile));
    } catch (FileNotFoundException e) {
      System.err.println("Unable to find signature properties file: " + signPropsFile);
    } catch (IOException e) {
      System.err.println("Unable to read signature properties file: " + signPropsFile);
    } 
    
    outProps.put("crypto_properties",  properties);
    outProps.put(WSHandlerConstants.SIG_PROP_REF_ID, "crypto_properties");
  }

  private void setWSS4JOutInterceptor(Object service) {
    Client client = ClientProxy.getClient( service );
    Endpoint cxfEP = client.getEndpoint();
    
    WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor( outProps );
    
    cxfEP.getOutInterceptors().add( wssOut );
  }
}
