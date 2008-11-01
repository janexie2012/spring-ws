package com.marvelution.samples.spring_ws.annotated_action_endpoint;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldImplTest {

	private HelloWorld helloWorld = new HelloWorldImpl();
	
	@Test
	public void testSayHello() {
		String text = helloWorld.sayHello("Hello World!");
		assertEquals(HelloWorld.SAY_HELLO_TEXT + " [Hello World!]", text);
	}

	@Test
	public void testSayHi() {
		String text = helloWorld.sayHi("Hi World!");
		assertEquals(HelloWorld.SAY_HI_TEXT + " [Hi World!]", text);
	}

}
