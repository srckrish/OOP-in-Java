// 5. Write a program to check the greatest number amongst three numbers.

import java.util.Scanner;

public class FindGreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the greatest.");
        } else {
            System.out.println(num3 + " is the greatest.");
        }

        sc.close();
    }
}


// Output:
// Enter the first number: 
// 5
// Enter the second number: 
// 8
// Enter the third number: 
// 2
// 8 is the greatest.