package com.marvelution.samples.spring_ws.annotated_action_endpoint;

public class HelloWorldImpl implements HelloWorld {
	
	public String sayHello(String text) {
		return SAY_HELLO_TEXT + " [" + text + "]";
	}

	public String sayHi(String text) {
		return SAY_HI_TEXT + " [" + text + "]";
	}

}
