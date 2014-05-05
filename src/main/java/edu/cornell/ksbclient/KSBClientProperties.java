package edu.cornell.ksbclient;

import javax.xml.namespace.QName;

public class KSBClientProperties {
  
  public static final String DEFAULT_SIGNATURE_PROPERTIES_FILE  = "client-sign.properties";
  public static final String DEFAULT_SIGNATURE_USER = "rice";
  public static final String DEFAULT_BASE_URL = "http://demo.rice.kuali.org";
  
  public static final String SIGNATURE_ACTION = "Signature";
  
  public static final String KEY_STORE_PASSWORD = "org.apache.ws.security.crypto.merlin.keystore.password";
  
  public static final String ROLE_WSDL_LOCATION = "/remoting/soap/kim/v2_0/roleService?wsdl";
  public static final QName QNAME_ROLE_SERVICE = new QName("http://rice.kuali.org/kim/v2_0", "roleService");
  public static final QName QNAME_ROLE_SERVICE_PORT = new QName("http://rice.kuali.org/kim/v2_0", "roleServicePort");
  
  public static final String PARAMETER_WSDL_LOCATION = "/remoting/soap/core/v2_0/parameterRepositoryService?wsdl";
  public static final QName QNAME_PARM_SERVICE = new QName("http://rice.kuali.org/core/v2_0", "parameterRepositoryService");
  public static final QName QNAME_PARM_SERVICE_PORT = new QName("http://rice.kuali.org/core/v2_0", "parameterServicePort");
  
  public static final String IDENTITY_WSDL_LOCATION = "/remoting/soap/kim/v2_0/identityService?wsdl";
  public static final QName QNAME_IDENTITY_SERVICE = new QName("http://rice.kuali.org/kim/v2_0", "identityService");
  public static final QName QNAME_IDENTITY_SERVICE_PORT = new QName("http://rice.kuali.org/kim/v2_0", "identityServicePort");
  
  public static final String WORKFLOW_ACTION_WSDL_LOCATION = "/remoting/soap/kew/v2_0/workflowDocumentActionsService?wsdl";
  public static final QName QNAME_WORKFLOW_ACTION_SERVICE = new QName("http://rice.kuali.org/kew/v2_0", "workflowDocumentActionsService");
  public static final QName QNAME_WORKFLOW_ACTION_SERVICE_PORT = new QName("http://rice.kuali.org/kew/v2_0", "workflowDocumentActionsServicePort");
  
  public static final String COUNTRY_WSDL_LOCATION = "/remoting/soap/location/v2_0/countryService?wsdl";
  public static final QName QNAME_COUNTRY_SERVICE = new QName("http://rice.kuali.org/location/v2_0", "countryService");
  public static final QName QNAME_COUNTRY_SERVICE_PORT = new QName("http://rice.kuali.org/location/v2_0", "CountryServicePort");
  
  public static final String POSTAL_WSDL_LOCATION = "/remoting/soap/location/v2_0/postalCodeService?wsdl";
  public static final QName QNAME_POSTAL_SERVICE = new QName("http://rice.kuali.org/location/v2_0", "postalCodeService");
  public static final QName QNAME_POSTAL_SERVICE_PORT = new QName("http://rice.kuali.org/location/v2_0", "PostalCodeServicePort");
  
  public static final String STATE_WSDL_LOCATION = "/remoting/soap/location/v2_0/stateService?wsdl";
  public static final QName QNAME_STATE_SERVICE = new QName("http://rice.kuali.org/location/v2_0", "stateService");
  public static final QName QNAME_STATE_SERVICE_PORT = new QName("http://rice.kuali.org/location/v2_0", "StateServicePort");
}
