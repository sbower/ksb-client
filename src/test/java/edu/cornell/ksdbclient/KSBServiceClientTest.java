package edu.cornell.ksdbclient;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import org.junit.Test;
import org.kuali.rice.core.v2_0.ParameterKeyType;
import org.kuali.rice.core.v2_0.ParameterService;

public class KSBServiceClientTest {
	
	@Test
	public void parameterServiceTest() throws Exception {
		KSBServiceClient client = new KSBServiceClient();
		
		ParameterService svc = client.getParameterService( new URL( "http://demo.rice.kuali.org/remoting/soap/core/v2_0/parameterRepositoryService?wsdl" ) );
		//Campuses campuses = svc.findAllCampuses();
		ParameterKeyType pk = new ParameterKeyType();
		pk.setApplicationId("KUALI");
		pk.setComponentCode("ActionList");
		pk.setNamespaceCode("KR-WKFLW");
		pk.setName("ACTION_LIST_DOCUMENT_POPUP_IND");
		
		String value = svc.getParameterValueAsString(pk);

		
		assertEquals( "Y", value );
		System.out.printf( "Parameter values is  %s \n", value);

	}
}
