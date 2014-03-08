package edu.cornell.ksdbclient;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class KSBClientCallbackHandler implements CallbackHandler {

	public void handle( Callback[] callbacks ) throws IOException, UnsupportedCallbackException {
		for( Callback thisCallback : callbacks )
		{
			WSPasswordCallback pwcb = (WSPasswordCallback)thisCallback;
			String user = pwcb.getIdentifier();
			int usage = pwcb.getUsage();
			
			if( usage == WSPasswordCallback.SIGNATURE )
			{
				// this is to provide the password for the alias within the keystore
				//  - while it is the same value as the keystore name and password,
				//  - you could craft a different alias than the keystore user
				if( "rice".equals( user ) ) pwcb.setPassword( "r1c3pw" );
			}
		}		
	}
}
