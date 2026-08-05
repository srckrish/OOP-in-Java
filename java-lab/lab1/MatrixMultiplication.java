// 23. Write a Java program to perform matrix multiplication.

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of rows and column of Matrix A: ");
        int rowA = sc.nextInt();
        int colA = sc.nextInt();

        System.out.print("Enter the size of rows and column of Matrix B: ");
        int rowB = sc.nextInt();
        int colB = sc.nextInt();

        if (colA != rowB) {
            System.out.print("Cannot perform matrix multiplication! The column of Matrix A must be equals to the row of Matrix B");
        } else {

            int A[][] = new int[rowA][colA];
            int B[][] = new int[rowB][colB];

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


            

        }

        sc.close();
    }
}
