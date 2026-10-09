// 22. Write a Java program to add two matrices.

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of Matrix A: ");
        int rowA = sc.nextInt();

        System.out.print("Enter the number of columns of Matrix A: ");
        int columnA = sc.nextInt();

        System.out.print("Enter the number of rows of Matrix B: ");
        int rowB = sc.nextInt();

        System.out.print("Enter the number of columns of Matrix B: ");
        int columnB = sc.nextInt();

        if (rowA != rowB || columnA != columnB) {
            System.out.println("The size of both matrices must be equal.");
            System.out.println("Matrix addition is not possible.");
        } else {

            int[][] matrixA = new int[rowA][columnA];
            int[][] matrixB = new int[rowB][columnB];
            int[][] sum = new int[rowA][columnA];

            // Input Matrix A
            System.out.println("Enter the elements of Matrix A:");

            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.print("Enter A[" + i + "][" + j + "]: ");
                    matrixA[i][j] = sc.nextInt();
                }
            }

            // Input Matrix B
            System.out.println("Enter the elements of Matrix B:");

            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.print("Enter B[" + i + "][" + j + "]: ");
                    matrixB[i][j] = sc.nextInt();
                }
            }

            // Add matrices
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    sum[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }

            // Display result
            System.out.println("Result of Matrix Addition:");

            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}

// Output: 
// Enter the number of rows of Matrix A: 2
// Enter the number of columns of Matrix A: 2
// Enter the number of rows of Matrix B: 2
// Enter the number of columns of Matrix B: 2
// Enter the elements of Matrix A:
// Enter A[0][0]: 1
// Enter A[0][1]: 1
// Enter A[1][0]: 1
// Enter A[1][1]: 1
// Enter the elements of Matrix B:
// Enter B[0][0]: 1
// Enter B[0][1]: 1
// Enter B[1][0]: 1
// Enter B[1][1]: 1
// Result of Matrix Addition:
// 2 2 
// 2 2
