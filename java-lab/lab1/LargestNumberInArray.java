// 19. Write a Java program to store 10 integers in an array and find the largest number.

import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        int largest;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number " + (i + 1) + " : ");
            arr[i] = sc.nextInt();

            if (i == 0 || arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.print("The largest number is: " + largest);

        sc.close();
    }
}
