#!/usr/bin/env ruby

require 'java'
require '../target/ksb-client-1.0.4-SNAPSHOT-jar-with-dependencies.jar'

java_import 'java.net.URL'

java_import 'edu.cornell.ksbclient.KSBServiceClient'
java_import 'org.kuali.rice.core.v2_0.CacheTargetType'
java_import java.util.ArrayList

client = KSBServiceClient.new

svc = client.getCoreCacheAdminService

ct = CacheTargetType.new
ct.setCache("http://rice.kuali.org/kim/v2_0/DelegateTypeType")
ct.setKey(nil)

ctList = ArrayList.new [ct]

resp = svc.flush(ctList)

puts resp.inspect
