package lab7;

@FunctionalInterface
interface Calculator {
	int calculate(int a, int b);
}

public class CalculatorDemo {
	public static void main(String[] args) {

		// Lambda expression for addition
		Calculator add = (a, b) -> a + b;

		int result = add.calculate(10, 5);

		System.out.println("Result: " + result);
	}
}