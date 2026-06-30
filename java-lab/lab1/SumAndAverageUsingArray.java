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
