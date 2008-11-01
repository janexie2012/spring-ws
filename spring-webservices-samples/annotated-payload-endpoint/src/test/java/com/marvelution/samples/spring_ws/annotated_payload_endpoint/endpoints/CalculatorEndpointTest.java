package com.marvelution.samples.spring_ws.annotated_payload_endpoint.endpoints;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marvelution.samples.schemas.calculatorserviceschema.Add;
import com.marvelution.samples.schemas.calculatorserviceschema.CalculateResponse;
import com.marvelution.samples.schemas.calculatorserviceschema.Divide;
import com.marvelution.samples.schemas.calculatorserviceschema.Multiply;
import com.marvelution.samples.schemas.calculatorserviceschema.ObjectFactory;
import com.marvelution.samples.schemas.calculatorserviceschema.Subtract;

public class CalculatorEndpointTest {

	private List<Double> numbers;
	private static CalculatorEndpoint endpoint;
	private static ObjectFactory objectFactory = new ObjectFactory();
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		endpoint = (CalculatorEndpoint) applicationContext.getBean("calculatorEndpoint");
	}
	
	@Before
	public void before() throws Exception {
		numbers = new ArrayList<Double>();
	}
	
	@After
	public void after() throws Exception {
		numbers = new ArrayList<Double>();
	}

	@Test
	public void testAdd() {
		numbers.add(new Double(1));
		numbers.add(new Double(2));
		numbers.add(new Double(3));
		numbers.add(new Double(4));
		Add addRequest = objectFactory.createAdd();
		addRequest.getNumber().addAll(numbers);
		CalculateResponse response = endpoint.add(addRequest);
		assertThat(response.getResult(), is((double)10));
	}

	@Test
	public void testSubtract() {
		numbers.add(new Double(4));
		numbers.add(new Double(2));
		numbers.add(new Double(1));
		Subtract subtractRequest = objectFactory.createSubtract();
		subtractRequest.getNumber().addAll(numbers);
		CalculateResponse response = endpoint.subtract(subtractRequest);
		assertThat(response.getResult(), is((double)1));
	}

	@Test
	public void testDivide() {
		numbers.add(new Double(1));
		numbers.add(new Double(2));
		Divide divideRequest = objectFactory.createDivide();
		divideRequest.getNumber().addAll(numbers);
		CalculateResponse response = endpoint.divide(divideRequest);
		assertThat(response.getResult(), is(0.5));
	}

	@Test
	public void testMultiply() {
		numbers.add(new Double(1));
		numbers.add(new Double(2));
		numbers.add(new Double(3));
		numbers.add(new Double(4));
		Multiply multiplyRequest = objectFactory.createMultiply();
		multiplyRequest.getNumber().addAll(numbers);
		CalculateResponse response = endpoint.multiply(multiplyRequest);
		assertThat(response.getResult(), is((double)24));
	}
	
}
