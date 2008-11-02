package com.marvelution.samples.spring.ws.annotated.payload.endpoint;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.marvelution.samples.spring.ws.annotated.payload.endpoint.Calculator;
import com.marvelution.samples.spring.ws.annotated.payload.endpoint.CalculatorImpl;

public class CalculatorImplTest {

	private List<Double> numbers = new ArrayList<Double>();
	private Calculator calculator = new CalculatorImpl();
	
	@Test
	public void testAdd() {
		numbers.add(new Double(1));
		numbers.add(new Double(2));
		numbers.add(new Double(3));
		numbers.add(new Double(4));
		double result = calculator.add(numbers);
		assertThat(result, is((double)10));
	}

	@Test
	public void testDivide() {
		numbers.add(new Double(1));
		numbers.add(new Double(2));
		double result = calculator.divide(numbers);
		assertThat(result, is(0.5));
	}

	@Test
	public void testMultiply() {
		numbers.add(new Double(1));
		numbers.add(new Double(2));
		numbers.add(new Double(3));
		numbers.add(new Double(4));
		double result = calculator.multiply(numbers);
		assertThat(result, is((double)24));
	}

	@Test
	public void testSubtract() {
		numbers.add(new Double(4));
		numbers.add(new Double(2));
		numbers.add(new Double(1));
		double result = calculator.subtract(numbers);
		assertThat(result, is((double)1));
	}

}
