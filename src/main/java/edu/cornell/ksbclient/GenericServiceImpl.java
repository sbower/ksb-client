package edu.cornell.ksbclient;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class GenericServiceImpl extends Service{

	public GenericServiceImpl(URL wsdlDocumentLocation, QName serviceName) {
		super(wsdlDocumentLocation, serviceName);
	}

}
