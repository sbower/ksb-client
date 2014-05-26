package edu.cornell.ksbclient;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.kuali.rice.core.v2_0.ComponentService;
import org.kuali.rice.core.v2_0.EqualType;
import org.kuali.rice.core.v2_0.NamespaceService;
import org.kuali.rice.core.v2_0.ParameterKeyType;
import org.kuali.rice.core.v2_0.ParameterService;
import org.kuali.rice.core.v2_0.QueryByCriteriaType;
import org.kuali.rice.core.v2_0.StringMapEntryListType;
import org.kuali.rice.kew.v2_0.WorkflowDocumentActionsService;
import org.kuali.rice.kew.v2_0.WorkflowDocumentService;
import org.kuali.rice.kim.v2_0.EntityType;
import org.kuali.rice.kim.v2_0.GroupService;
import org.kuali.rice.kim.v2_0.IdentityService;
import org.kuali.rice.kim.v2_0.RoleService;
import org.kuali.rice.location.v2_0.CountryService;
import org.kuali.rice.location.v2_0.PostalCodeService;
import org.kuali.rice.location.v2_0.PostalCodeType;
import org.kuali.rice.location.v2_0.StateQueryResultsType;
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
	   
	   EqualType et = new EqualType();
	   et.setPropertyPath("name");
	   et.setStringValue("NEW YORK");
	   
	   QueryByCriteriaType qbct = new QueryByCriteriaType();
	   qbct.setEqual(et);
	   qbct.setCountFlag("NONE");
	   
	   StateQueryResultsType sqrt = svc.findStates(qbct);
	   assertEquals("NY", sqrt.getResults().getState().get(0).getCode());
	   
   }
   
   @Test
   public void groupServiceTest() throws Exception {
	   KSBServiceClient client = new KSBServiceClient();  
	   GroupService svc = client.getGroupService();
	
	   assertEquals("Kuali Administrators", svc.getGroup("2008").getName());
	   
   }
   
   @Test @Ignore
   public void workflowDocumentServiceTest() throws Exception {
	   KSBServiceClient client = new KSBServiceClient();  
	   WorkflowDocumentService svc = client.getWorkflowDocumentService();
	
	   assertEquals("F", svc.getDocument("3063").getStatus());
	   
   }
   
   @Test
   public void componentServiceTest() throws Exception {
     KSBServiceClient client = new KSBServiceClient();  
     ComponentService svc = client.getComponentService();
  
     assertEquals("Action List", svc.getComponentByCode("KR-WKFLW", "ActionList").getName());
     
   }
   
   @Test
   public void namespaceServiceTest() throws Exception {
     KSBServiceClient client = new KSBServiceClient();  
     NamespaceService svc = client.getNamespaceService();
  
     assertEquals("Workflow", svc.getNamespace("KR-WKFLW").getName());
     
   }
}
