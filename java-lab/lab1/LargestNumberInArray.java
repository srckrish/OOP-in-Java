// 19. Write a Java program to store 10 integers in an array // and find the largest number.

import java.util.Scanner;

public class LargestNumberInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int largestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largestNumber);

        sc.close();
    }
}

// Output: 
// Enter number 1: 10
// Enter number 2: 9
// Enter number 3: 4
// Enter number 4: 5
// Enter number 5: 6
// Enter number 6: 7
// Enter number 7: 8 
// Enter number 8: 2
// Enter number 9: 1
// Enter number 10: -5
// The largest number is: 10
