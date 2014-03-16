package edu.cornell.ksbclient;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class KSBClientCallbackHandler implements CallbackHandler {

	public void handle( Callback[] callbacks ) throws IOException, UnsupportedCallbackException {
		for( Callback thisCallback : callbacks ) {
		  
		  //Let's make sure this is the signature callback
			WSPasswordCallback pwcb = (WSPasswordCallback)thisCallback;
			String user = pwcb.getIdentifier();
			int usage = pwcb.getUsage();
			
			//got call back, have to set key store password
			if( usage == WSPasswordCallback.SIGNATURE ) {
			  
			  if( KSBClientProperties.DEFAULT_SIGNATURE_USER.equals( user ) ) {
			    pwcb.setPassword( "r1c3pw" );
			  } else {
			      //Grab key store pass from the crypto properties
		       pwcb.setPassword(KSBServiceClient.getProperty(KSBClientProperties.KEY_STORE_PASSWORD));
			  }
			}
		}		
	}
}
