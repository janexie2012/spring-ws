package com.marvelution.samples.spring.ws.annotated.action.endpoint.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.soap.addressing.server.annotation.Action;

import com.marvelution.samples.schemas.helloworldserviceschema.ObjectFactory;
import com.marvelution.samples.schemas.helloworldserviceschema.SayHello;
import com.marvelution.samples.schemas.helloworldserviceschema.SayHelloResponse;
import com.marvelution.samples.schemas.helloworldserviceschema.SayHi;
import com.marvelution.samples.schemas.helloworldserviceschema.SayHiResponse;
import com.marvelution.samples.spring.ws.annotated.action.endpoint.HelloWorld;

@Endpoint
public class HelloWorldEndpoint {

	private final HelloWorld helloWorldImpl;
	private final ObjectFactory objectFactory;

	public HelloWorldEndpoint(HelloWorld helloWorld, ObjectFactory factory) {
		this.helloWorldImpl = helloWorld;
		this.objectFactory = factory;
	}

	@Action("http://www.marvelution.com/samples/definitions/HelloWorldService/SayHi")
	public SayHiResponse sayHi(SayHi sayHi) {
		SayHiResponse response = objectFactory.createSayHiResponse();
		String responseText = helloWorldImpl.sayHi(sayHi.getText());
		response.setResponse(responseText);
		return response;
	}

	@Action("http://www.marvelution.com/samples/definitions/HelloWorldService/SayHello")
	public SayHelloResponse sayHello(SayHello sayHello) {
		SayHelloResponse response = objectFactory.createSayHelloResponse();
		String responseText = helloWorldImpl.sayHello(sayHello.getText());
		response.setResponse(responseText);
		return response;
	}

}
