package com.marvelution.samples.spring.ws.annotated.action.endpoint;

public interface HelloWorld {

	public static final String SAY_HI_TEXT = "Hi Easter! All are cleaned up!";
	public static final String SAY_HELLO_TEXT = "Hello Easter! what? show add ";
	
	public String sayHi(String text);

	public String sayHello(String text);

}
