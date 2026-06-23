// 4. Write a program to check if a number is positive, negative or zero.

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num + " is negative.");
        } else if (num == 0) {
            System.out.print(num + " is zero.");
        } else {
            System.out.print(num + " is positive.");
        }

        sc.close();
    }
}

// Output:
// Enter the number: 5
// 5 is positive.

