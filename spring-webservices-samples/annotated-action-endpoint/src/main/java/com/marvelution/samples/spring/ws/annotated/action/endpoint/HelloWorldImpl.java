package com.marvelution.samples.spring.ws.annotated.action.endpoint;

public class HelloWorldImpl implements HelloWorld {
	
	public String sayHello(String text) {
		return SAY_HELLO_TEXT + " [" + text + "]";
	}

	public String sayHi(String text) {
		return SAY_HI_TEXT + " [" + text + "]";
	}

}
