package com.marvelution.samples.spring.ws.annotated.payload.endpoint;

import java.util.List;

public interface Calculator {

	public double add(List<Double> numbers);

	public double subtract(List<Double> numbers);

	public double divide(List<Double> numbers);

	public double multiply(List<Double> numbers);

}
