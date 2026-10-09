// 18. Write a Java program that stores 10 integer numbers in an array to calculate and display 
// the sum and average of all elements.

import java.util.Scanner;

public class SumAndAverageUsingArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        sc.close();
    }
}

// Output: 
// Enter the value 1 : 10
// Enter the value 2 : 9
// Enter the value 3 : 8
// Enter the value 4 : 7
// Enter the value 5 : 6
// Enter the value 6 : 5
// Enter the value 7 : 4
// Enter the value 8 : 3
// Enter the value 9 : 2
// Enter the value 10 : 1
// Sum: 55
// Average: 5.5
