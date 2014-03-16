package edu.cornell.ksbclient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.kuali.rice.core.v2_0.ParameterRepositoryService;
import org.kuali.rice.core.v2_0.ParameterService;
import org.kuali.rice.kim.v2_0.RoleService;
import org.kuali.rice.kim.v2_0.RoleService_Service;

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
	
  // Need to clean up the services, start combining into a generic service
  public ParameterService getParameterService () {
    
		ParameterRepositoryService svc;
		
    try {
      svc = new ParameterRepositoryService(baseURL);
      ParameterService parameterService = svc.getParameterServicePort();
      
      setWSS4JOutInterceptor(parameterService);
      return parameterService;
    } catch (MalformedURLException e) {
      System.err.println("Invalid URL: " + baseURL);
      return null;
    }
		
	}
  
  public RoleService getRoleService() {
    RoleService_Service svc;
    
    try {
      svc = new RoleService_Service(baseURL);
      RoleService rolseService = svc.getRoleServicePort();
      
      setWSS4JOutInterceptor(rolseService);
      return rolseService;
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
