package org.soap;

import javax.jws.WebService;

@WebService(targetNamespace = "http://soap.org/", portName = "CallServicePort", serviceName = "CallServiceService")
public class CallService {
	public  String getUrName(String name){ 
		return "Hello Mr."+name+"welcome to web service";
	}

}
