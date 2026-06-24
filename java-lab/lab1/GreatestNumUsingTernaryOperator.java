// 8. Write a program to check the greatest between two numbers using ternary (?) operator.

import java.util.Scanner;

public class GreatestNumUsingTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        String result = (num1 > num2)
                ? num1 + " is the greatest."
                : (num2 > num1)
                        ? num2 + " is the greatest."
                        : "Both numbers are equal.";

        System.out.println(result);
        sc.close();
    }
}

// Output:
// Enter the first number:
// 5
// Enter the second number:
// 5
// Both numbers are equal.
