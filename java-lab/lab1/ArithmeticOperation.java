/* 7. Write a program to take two numbers as input from user and perform arithmetic operation
based on the character given by user ( + for addition, - for subtraction, * for
    multiplication, / for division and % for modulus.) using switch-case. */
    
import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Select the operation (+, - , *, /, %): ");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                System.out.println("Sum: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Difference: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Product: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Divison: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println("Modulus: " + (num1 % num2));
                } else {
                    System.out.println("Cannot perform modulus by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operation chosen! Please choose the valid operation (+, - , *, /, %).");
        }
        sc.close();
    }

}

// Output:
// Enter the first number:
// 5
// Enter the second number:
// 4
// Select the operation (+, - , *, /, %):
// *
// Product: 20.0