package com.marvelution.samples.spring_ws.annotated_payload_endpoint;

import java.util.List;

public interface Calculator {

	public double add(List<Double> numbers);

	public double subtract(List<Double> numbers);

	public double divide(List<Double> numbers);

	public double multiply(List<Double> numbers);

}
