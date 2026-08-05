// 23. Write a Java program to perform matrix multiplication.

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of rows of Matrix A: ");
        int rowA = sc.nextInt();
        System.out.print("Enter the size of columns of Matrix A: ");
        int colA = sc.nextInt();

        System.out.print("Enter the size of rows of Matrix B: ");
        int rowB = sc.nextInt();
        System.out.print("Enter the size of columns of Matrix B: ");
        int colB = sc.nextInt();

        if (colA != rowB) {
            System.out.println("Matrix multiplication is not possible.");
            System.out.println("Number of columns in Matrix A must be equal to the number of rows in Matrix B.");
        } else {
            int A[][] = new int[rowA][colA];
            int B[][] = new int[rowB][colB];
            int result[][] = new int[rowA][colB];

            // Matrix A
            System.out.println("Enter the elements of Matrix A: ");

            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < colA; j++) {
                    System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]: ");
                    A[i][j] = sc.nextInt();
                }
            }

            // Matrix B
            System.out.println("Enter the elements for Matrix B: ");

            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < colB; j++) {
                    System.out.print("B[" + (i + 1) + "][" + (j + 1) + "]: ");
                    B[i][j] = sc.nextInt();
                }
            }

            // Matrix Multiplication

            // // Java automatically initializes all elements of a newly created int array to 0, so there is no need to initialize the result matrix manually.

            // for (int i = 0; i < rowA; i++) {
            //     for (int j = 0; j < colB; j++) {
            //         result[i][j] = 0;
            //     }
            // }

            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < colB; j++) {
                    for (int k = 0; k < colA; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            // Display result
            System.out.println("Resultant Matrix:");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < colB; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

        }

        sc.close();
    }
}


// Output: 

// Enter the size of rows of Matrix A: 2
// Enter the size of columns of Matrix A: 2
// Enter the size of rows of Matrix B: 2
// Enter the size of columns of Matrix B: 2
// Enter the elements of Matrix A: 
// A[1][1]: 1
// A[1][2]: 2
// A[2][1]: 3
// A[2][2]: 4
// Enter the elements for Matrix B: 
// B[1][1]: 5
// B[1][2]: 6
// B[2][1]: 7
// B[2][2]: 8
// Resultant Matrix:
// 19 22 
// 43 50