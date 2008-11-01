package com.marvelution.samples.spring_ws.annotated_payload_endpoint;

import java.util.List;

import org.springframework.util.Assert;

public class CalculatorImpl implements Calculator {

	public double add(List<Double> numbers) {
		Assert.notNull(numbers);
		Assert.notEmpty(numbers);
		double result = 0;
		for (Double number : numbers) {
			result += number;
		}
		return result;
	}

	public double divide(List<Double> numbers) {
		Assert.notNull(numbers);
		Assert.notEmpty(numbers);
		double result = 0;
		for (double number : numbers) {
			if (result == 0) {
				result = number;
			} else {
				result /= number;
			}
		}
		return result;
	}

	public double multiply(List<Double> numbers) {
		Assert.notNull(numbers);
		Assert.notEmpty(numbers);
		double result = 0;
		for (double number : numbers) {
			if (result == 0) {
				result = number;
			} else {
				result *= number;
			}
		}
		return result;
	}

	public double subtract(List<Double> numbers) {
		Assert.notNull(numbers);
		Assert.notEmpty(numbers);
		double result = 0;
		for (double number : numbers) {
			if (result == 0) {
				result = number;
			} else {
				result -= number;
			}
		}
		return result;
	}

}
