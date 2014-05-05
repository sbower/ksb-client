package edu.cornell.ksbclient;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.kuali.rice.core.v2_0.ParameterKeyType;
import org.kuali.rice.core.v2_0.ParameterService;
import org.kuali.rice.core.v2_0.StringMapEntryListType;
import org.kuali.rice.kew.v2_0.WorkflowDocumentActionsService;
import org.kuali.rice.kim.v2_0.EntityType;
import org.kuali.rice.kim.v2_0.IdentityService;
import org.kuali.rice.kim.v2_0.RoleService;
import org.kuali.rice.location.v2_0.CountryService;
import org.kuali.rice.location.v2_0.PostalCodeService;
import org.kuali.rice.location.v2_0.PostalCodeType;
import org.kuali.rice.location.v2_0.StateService;

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

     EntityType et = svc.getEntityByPrincipalId("1");
     assertEquals( "kr", et.getPrincipals().getPrincipal().get(0).getPrincipalName());

   }
   
   @Test @Ignore
   public void workflowDocumentActionsServiceTest () throws Exception {
	   KSBServiceClient client = new KSBServiceClient();  
	   WorkflowDocumentActionsService svc = client.getWorkflowDocumentActionsService();
	   
	   assertTrue(svc.isUserInRouteLog("3039", "admin", false));
   }
   
   @Test
   public void countryServiceTest() throws Exception {
	   KSBServiceClient client = new KSBServiceClient();  
	   CountryService svc = client.getCountryService();
	
	   assertEquals("US", svc.getDefaultCountry().getCode());
   }
   
   @Test @Ignore
   public void postalServiceTest() throws Exception {
	   KSBServiceClient client = new KSBServiceClient();  
	   PostalCodeService svc = client.getPostalCodeService();
	
	   PostalCodeType pt = svc.getPostalCode("US", "14845");
	   assertEquals("HORSEHEADS", pt.getCityName());
   }
   
   @Test
   public void stateServiceTest() throws Exception {
	   KSBServiceClient client = new KSBServiceClient();  
	   StateService svc = client.getStateService();
	
	   assertEquals("NEW YORK", svc.getState("US", "NY").getName());
   }
}
