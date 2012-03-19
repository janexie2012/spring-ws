package com.marvelution.samples.spring.ws.annotated.action.endpoint;

public interface HelloWorld {

	public static final String SAY_HI_TEXT = "Hi Easter! ";
	public static final String SAY_HELLO_TEXT = "Hello Easter! ";
	
	public String sayHi(String text);

	public String sayHello(String text);

}
