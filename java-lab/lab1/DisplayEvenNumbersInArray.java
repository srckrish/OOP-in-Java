// 20. Write a Java program to display all even numbers from an array.

/* import java.util.Scanner;

public class DisplayEvenNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int elementsCount = sc.nextInt();
        int arr[] = new int[elementsCount];

        int evenNumbers[] = new int[elementsCount];
        int evenNumbersCount = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                evenNumbers[evenNumbersCount] = arr[i];
                evenNumbersCount++;
            }

        }

        if (evenNumbersCount > 0) {
            System.out.println("The even numbers are : ");
            for (int i = 0; i < evenNumbersCount; i++) {
                System.out.print(evenNumbers[i] + " ");
            }
        } else {
            System.out.println("No even numbers found");
        }

        sc.close();
    }
}
 */

import java.util.Scanner;

public class DisplayEvenNumbersInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numberOfElements = sc.nextInt();

        int arr[] = new int[numberOfElements];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        int evenNumbersCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (evenNumbersCount == 0) {
                    System.out.println("Even numbers are:");
                }
                System.out.print(arr[i] + " ");
                evenNumbersCount++;
            }
        }

        if (evenNumbersCount == 0) {
            System.out.println("No even numbers found");
        }

        sc.close();
    }

}

// Output: 
// Enter the number of elements: 5 
// Enter number 1 : 5 
// Enter number 2 : 6
// Enter number 3 : 7
// Enter number 4 : 8
// Enter number 5 : 9
// Even numbers are:
// 6 8