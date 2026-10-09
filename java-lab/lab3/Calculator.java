// 6. Create a package named mypackage and define a class Calculator inside it. The class should contain methods to perform addition, subtraction, multiplication, and division of two numbers.
// Create another class named TestCalculator outside the package. Import the Calculator class using the import statement and demonstrate all four arithmetic operations by creating an object of the Calculator class.
package java

-lab.lab3.Calculator;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}
