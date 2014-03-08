package edu.cornell.ksbclient;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.kuali.rice.core.v2_0.ParameterRepositoryService;
import org.kuali.rice.core.v2_0.ParameterService;


public class KSBServiceClient {
	
	public ParameterService getParameterService( URL url ) {
		
		ParameterRepositoryService svc = new ParameterRepositoryService();
		
		ParameterService parameterService = svc.getParameterServicePort();
		
		Client client = ClientProxy.getClient( parameterService );
		Endpoint cxfEP = client.getEndpoint();
		
		Map<String, Object> outProps = new HashMap<String, Object>();
		outProps.put( WSHandlerConstants.ACTION, "Signature" );
		outProps.put( WSHandlerConstants.USER, "rice" );
		outProps.put( WSHandlerConstants.PW_CALLBACK_CLASS, KSBClientCallbackHandler.class.getName() );
		outProps.put( WSHandlerConstants.SIG_PROP_FILE, "client-sign.properties" );
		
		WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor( outProps );
		
		cxfEP.getOutInterceptors().add( wssOut );
		
		return parameterService;
	}
}
