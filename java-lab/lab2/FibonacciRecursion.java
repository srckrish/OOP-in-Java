// 5. Write a program in Java to demonstrate fibonacci series
// up to the nth term using recursion.

import java.util.Scanner;

public class FibonacciRecursion {

    // Recursive method to find the nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0) {
            return 0; // base case 1
        }

        if (n == 1) {
            return 1;       // base case 2

        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }
}
