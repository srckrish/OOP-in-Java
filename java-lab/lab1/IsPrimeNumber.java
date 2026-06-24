// 12. Write a program to check if a number is prime or not. 

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is neither prime nor composite.");
        } else {

            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is composite number.");
            }
        }
        sc.close();
    }
}

// Output:
// Enter a number:
// 13
// 13 is a prime number.