package com.marvelution.samples.spring.ws.annotated.action.endpoint;

public interface HelloWorld {

	public static final String SAY_HI_TEXT = "Hi There! I'm the SayHi Operation and you send this text: ";
	public static final String SAY_HELLO_TEXT = "ello There! I'm the SayHello Operation and you send this text: ";
	
	public String sayHi(String text);

	public String sayHello(String text);

}
