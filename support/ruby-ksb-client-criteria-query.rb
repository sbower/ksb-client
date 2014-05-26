#!/usr/bin/env ruby 

require 'java'
require '../target/ksb-client-1.0.2-SNAPSHOT-jar-with-dependencies.jar'

java_import 'java.util.ArrayList'

java_import 'org.kuali.rice.location.v2_0.PostalCodeQueryResultsType'
java_import 'org.kuali.rice.location.v2_0.PostalCodeService'
java_import 'org.kuali.rice.location.v2_0.PostalCodeType'
java_import 'org.kuali.rice.core.v2_0.EqualType'
java_import 'org.kuali.rice.core.v2_0.QueryByCriteriaType'

java_import 'edu.cornell.ksbclient.KSBServiceClient'

client = KSBServiceClient.new
svc = client.getPostalCodeService()

et = EqualType.new 
et.setPropertyPath("state.code")
et.setStringValue("NY")

qbct =  QueryByCriteriaType.new
qbct.setEqual(et)
qbct.setCountFlag("NONE")

postal_list = svc.findPostalCodes(qbct).getResults().getPostalCode()

postal_list.each do |postal|
  puts postal.getCode()
end