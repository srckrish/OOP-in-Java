// 25. Write a Java program to display diagonal elements of a square matrix.

import java.util.Scanner;

public class DiagonalElementsOfMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        sc.close();
    }
}
