package edu.cornell.ksbclient;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.kuali.rice.core.v2_0.ParameterKeyType;
import org.kuali.rice.core.v2_0.ParameterService;
import org.kuali.rice.core.v2_0.StringMapEntryListType;
import org.kuali.rice.kim.v2_0.EntityType;
import org.kuali.rice.kim.v2_0.IdentityService;
import org.kuali.rice.kim.v2_0.RoleService;

public class KSBServiceClientTest {
	
	@Test
	public void parameterServiceTest() throws Exception {
	  KSBServiceClient client = new KSBServiceClient();
		
    ParameterService svc = client.getParameterService();

		ParameterKeyType pk = new ParameterKeyType();
		pk.setApplicationId("KUALI");
		pk.setComponentCode("ActionList");
		pk.setNamespaceCode("KR-WKFLW");
		pk.setName("ACTION_LIST_DOCUMENT_POPUP_IND");
		
		String value = svc.getParameterValueAsString(pk);

		
		assertEquals( "Y", value );

	}
	
	 @Test
	  public void roleServiceTest() throws Exception {
	    KSBServiceClient client = new KSBServiceClient();	    
	    RoleService svc = client.getRoleService();

	    List<String> ids = svc.getRoleMemberPrincipalIds("KR-SYS", "System User", new StringMapEntryListType()).getPrincipalId();

	    assertEquals( "1", ids.get(0) );

	  }
	 
   @Test
   public void identityServiceTest() throws Exception {
     KSBServiceClient client = new KSBServiceClient();     
     IdentityService svc = client.getIdentityService();

     //List<String> ids = svc.getRoleMemberPrincipalIds("KR-SYS", "System User", new StringMapEntryListType()).getPrincipalId();
     EntityType et = svc.getEntityByPrincipalId("1");
     assertEquals( "kr", et.getPrincipals().getPrincipal().get(0).getPrincipalName());

   }
}
