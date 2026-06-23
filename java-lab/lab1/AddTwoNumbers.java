// 2. WAP to take two numbers from the user and display their sum.

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.print("The sum of two numbers is: " + sum);

        sc.close();
    }
}

// Output:
// Enter the first number: 5
// Enter the second number: 7
// The sum of two numbers is: 12