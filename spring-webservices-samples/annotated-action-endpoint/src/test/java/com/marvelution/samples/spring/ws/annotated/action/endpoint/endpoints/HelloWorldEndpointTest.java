package com.marvelution.samples.spring.ws.annotated.action.endpoint.endpoints;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marvelution.samples.schemas.helloworldserviceschema.ObjectFactory;
import com.marvelution.samples.schemas.helloworldserviceschema.SayHello;
import com.marvelution.samples.schemas.helloworldserviceschema.SayHelloResponse;
import com.marvelution.samples.schemas.helloworldserviceschema.SayHi;
import com.marvelution.samples.schemas.helloworldserviceschema.SayHiResponse;
import com.marvelution.samples.spring.ws.annotated.action.endpoint.HelloWorld;
import com.marvelution.samples.spring.ws.annotated.action.endpoint.endpoints.HelloWorldEndpoint;

public class HelloWorldEndpointTest {

	private static HelloWorldEndpoint endpoint;
	private static final ObjectFactory factory = new ObjectFactory();

	@BeforeClass
	public static void beforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		endpoint = (HelloWorldEndpoint) context.getBean("helloWorldEndpoint");
	}

	@Test
	public void testSayHi() {
		SayHi hi = factory.createSayHi();
		hi.setText("Hi World!");
		SayHiResponse response = endpoint.sayHi(hi);
		assertEquals(HelloWorld.SAY_HI_TEXT + " [Hi World!]", response.getResponse());
	}

	@Test
	public void testSayHello() {
		SayHello hello = factory.createSayHello();
		hello.setText("Hello World!");
		SayHelloResponse response = endpoint.sayHello(hello);
		assertEquals(HelloWorld.SAY_HELLO_TEXT + " [Hello World!]", response.getResponse());
	}

}
