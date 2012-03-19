package com.marvelution.samples.spring.ws.annotated.action.endpoint;

public interface HelloWorld {

	public static final String SAY_HI_TEXT = "Hi Easter! Again!";
	public static final String SAY_HELLO_TEXT = "Hello Easter! what? ";
	
	public String sayHi(String text);

	public String sayHello(String text);

}
