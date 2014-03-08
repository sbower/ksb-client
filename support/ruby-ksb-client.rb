#!/usr/bin/env ruby 

require 'java'
require '../target/ksb-client-1.0-SNAPSHOT-jar-with-dependencies.jar'

java_import 'java.net.URL'

java_import 'org.kuali.rice.core.v2_0.ParameterKeyType'
java_import 'org.kuali.rice.core.v2_0.ParameterService'
java_import 'edu.cornell.ksbclient.KSBServiceClient'

application_id = ARGV[0] || "KUALI"
component_code = ARGV[1] || "ActionList"
namespace_code = ARGV[2] || "KR-WKFLW"
parm_name = ARGV[3] || "ACTION_LIST_DOCUMENT_POPUP_IND"

client = KSBServiceClient.new
svc = client.getParameterService(URL.new("http://demo.rice.kuali.org/remoting/soap/core/v2_0/parameterRepositoryService?wsdl"))

pk = ParameterKeyType.new
pk.setApplicationId(application_id)
pk.setComponentCode(component_code)
pk.setNamespaceCode(namespace_code)
pk.setName(parm_name)

value = svc.getParameterValueAsString(pk)

puts value