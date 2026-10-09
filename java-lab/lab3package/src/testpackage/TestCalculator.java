package testpackage;

import mypackage.Calculator;

public class TestCalculator {

	public static void main(String[] args) {

		Calculator c = new Calculator();

		System.out.println("Addition: " + c.add(20, 10));
		System.out.println("Subtraction: " + c.subtract(20, 10));
		System.out.println("Multiplication: " + c.multiply(20, 10));
		System.out.println("Division: " + c.divide(20, 10));
	}
}