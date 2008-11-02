package com.marvelution.samples.spring.ws.annotated.payload.endpoint.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import com.marvelution.samples.schemas.calculatorserviceschema.Add;
import com.marvelution.samples.schemas.calculatorserviceschema.CalculateResponse;
import com.marvelution.samples.schemas.calculatorserviceschema.Divide;
import com.marvelution.samples.schemas.calculatorserviceschema.Multiply;
import com.marvelution.samples.schemas.calculatorserviceschema.ObjectFactory;
import com.marvelution.samples.schemas.calculatorserviceschema.Subtract;
import com.marvelution.samples.spring.ws.annotated.payload.endpoint.Calculator;

@Endpoint
public class CalculatorEndpoint {

	private final Calculator calculator;
	private final ObjectFactory objectFactory;
	
	public CalculatorEndpoint(Calculator calculator, ObjectFactory objectFactory) {
		this.calculator = calculator;
		this.objectFactory = objectFactory;
	}
	
	@PayloadRoot(namespace = "http://www.marvelution.com/samples/schemas/CalculatorServiceSchema", localPart = "Add")
	public CalculateResponse add(Add numbers) {
		return wrapResult(calculator.add(numbers.getNumber()));
	}
	
	@PayloadRoot(namespace = "http://www.marvelution.com/samples/schemas/CalculatorServiceSchema", localPart = "Subtract")
	public CalculateResponse subtract(Subtract numbers) {
		return wrapResult(calculator.subtract(numbers.getNumber()));
	}
	
	@PayloadRoot(namespace = "http://www.marvelution.com/samples/schemas/CalculatorServiceSchema", localPart = "Divide")
	public CalculateResponse divide(Divide numbers) {
		return wrapResult(calculator.divide(numbers.getNumber()));
	}
	
	@PayloadRoot(namespace = "http://www.marvelution.com/samples/schemas/CalculatorServiceSchema", localPart = "Multiply")
	public CalculateResponse multiply(Multiply numbers) {
		return wrapResult(calculator.multiply(numbers.getNumber()));
	}
	
	private CalculateResponse wrapResult(double result) {
		CalculateResponse response = objectFactory.createCalculateResponse();
		response.setResult(result);
		return response;
	}
	
}
