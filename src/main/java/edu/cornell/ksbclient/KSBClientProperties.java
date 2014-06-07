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
  
  public static final String GROUP_WSDL_LOCATION = "/remoting/soap/kim/v2_0/groupService?wsdl";
  public static final QName QNAME_GROUP_SERVICE = new QName("http://rice.kuali.org/kim/v2_0", "groupService");
  public static final QName QNAME_GROUP_SERVICE_PORT = new QName("http://rice.kuali.org/kim/v2_0", "groupServicePort");
  
  public static final String WORKFLOW_ACTION_WSDL_LOCATION = "/remoting/soap/kew/v2_0/workflowDocumentActionsService?wsdl";
  public static final QName QNAME_WORKFLOW_ACTION_SERVICE = new QName("http://rice.kuali.org/kew/v2_0", "workflowDocumentActionsService");
  public static final QName QNAME_WORKFLOW_ACTION_SERVICE_PORT = new QName("http://rice.kuali.org/kew/v2_0", "workflowDocumentActionsServicePort");

  public static final String WORKFLOW_DOCUMENT_WSDL_LOCATION = "/remoting/soap/kew/v2_0/workflowDocumentService?wsdl";
  public static final QName QNAME_WORKFLOW_DOCUMENT_SERVICE = new QName("http://rice.kuali.org/kew/v2_0", "workflowDocumentService");
  public static final QName QNAME_WORKFLOW_DOCUMENT_SERVICE_PORT = new QName("http://rice.kuali.org/kew/v2_0", "workflowDocumentServicePort");
  
  public static final String COUNTRY_WSDL_LOCATION = "/remoting/soap/location/v2_0/countryService?wsdl";
  public static final QName QNAME_COUNTRY_SERVICE = new QName("http://rice.kuali.org/location/v2_0", "countryService");
  public static final QName QNAME_COUNTRY_SERVICE_PORT = new QName("http://rice.kuali.org/location/v2_0", "CountryServicePort");
  
  public static final String POSTAL_WSDL_LOCATION = "/remoting/soap/location/v2_0/postalCodeService?wsdl";
  public static final QName QNAME_POSTAL_SERVICE = new QName("http://rice.kuali.org/location/v2_0", "postalCodeService");
  public static final QName QNAME_POSTAL_SERVICE_PORT = new QName("http://rice.kuali.org/location/v2_0", "PostalCodeServicePort");
  
  public static final String STATE_WSDL_LOCATION = "/remoting/soap/location/v2_0/stateService?wsdl";
  public static final QName QNAME_STATE_SERVICE = new QName("http://rice.kuali.org/location/v2_0", "stateService");
  public static final QName QNAME_STATE_SERVICE_PORT = new QName("http://rice.kuali.org/location/v2_0", "StateServicePort");
  
  public static final String COMPONENT_WSDL_LOCATION = "/remoting/soap/core/v2_0/componentService?wsdl";
  public static final QName QNAME_COMPONENT_SERVICE = new QName("http://rice.kuali.org/core/v2_0", "componentService");
  public static final QName QNAME_COMPONENT_SERVICE_PORT = new QName("http://rice.kuali.org/core/v2_0", "componentServicePort");
  
  public static final String NAMESPACE_WSDL_LOCATION = "/remoting/soap/core/v2_0/namespaceService?wsdl";
  public static final QName QNAME_NAMESPACE_SERVICE = new QName("http://rice.kuali.org/core/v2_0", "namespaceService");
  public static final QName QNAME_NAMESPACE_SERVICE_PORT = new QName("http://rice.kuali.org/core/v2_0", "namespaceServicePort");
  
  public static final String SEND_NOTIFICATION_WSDL_LOCATION = "/remoting/soap/ken/v2_0/sendNotificationService?wsdl";
  public static final QName QNAME_SEND_NOTIFICATION_SERVICE = new QName("http://rice.kuali.org/ken/v2_0", "sendNotificationService");
  public static final QName QNAME_SEND_NOTIFICATION_SERVICE_PORT = new QName("http://rice.kuali.org/ken/v2_0", "sendNotificationServicePort"); 
 
  public static final String ACTION_QUEUE_WSDL_LOCATION = "/remoting/soap/kew/v2_0/actionInvocationQueue?wsdl";
  public static final QName QNAME_ACTION_QUEUE_SERVICE = new QName("http://rice.kuali.org/kew/v2_0", "actionInvocationQueue");
  public static final QName QNAME_ACTION_QUEUE_SERVICE_PORT = new QName("http://rice.kuali.org/kew/v2_0", "actionInvocationQueuePort"); 
  
  public static final String ACTION_LIST_CUSTOM_WSDL_LOCATION = "/remoting/soap/kew/v2_0/actionListCustomizationHandlerService?wsdl";
  public static final QName QNAME_ACTION_LIST_CUSTOM_SERVICE = new QName("http://rice.kuali.org/kew/v2_0", "actionListCustomizationHandlerService");
  public static final QName QNAME_ACTION_LIST_CUSTOM_SERVICE_PORT = new QName("http://rice.kuali.org/kew/v2_0", "actionListCustomizationHandlerServicePort"); 
  
  public static final String ACTION_LIST_WSDL_LOCATION = "/remoting/soap/kew/v2_0/actionListService?wsdl";
  public static final QName QNAME_ACTION_LIST_SERVICE = new QName("http://rice.kuali.org/kew/v2_0", "actionListService");
  public static final QName QNAME_ACTION_LIST_SERVICE_PORT = new QName("http://rice.kuali.org/kew/v2_0", "actionListServicePort"); 
  
}
