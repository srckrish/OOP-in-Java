// 15. Write a program to check if a number is palindrome or not.

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {
        int num, originalNumber, reversedNumber = 0, remainder;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        originalNumber = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num = num / 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.print(originalNumber + " is Palindrome");
        } else {
            System.out.print(originalNumber + " is not Palindrome Number");
        }

        sc.close();
    }
}

// Output:
// Enter a number: 12321
// 12321 is Palindrome
