import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] single = { 1, 2, 3, 4 };
        int[][] multi = new int[2][2];
        // int[][] jagged = new int[2][];

        System.out.println("Single Dimension Array Data");
        for (int data : single) {
            System.out.print(data + " ");
        }

        System.out.println();

        System.out.println("MultiDimensions Array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter Value [" + (i + 1) + "][" + (j + 1) + "]: ");
                multi[i][j] = sc.nextInt();
            }
        }

        for (int[] row : multi) {
            System.out.print(Arrays.toString(row) + " ");
            System.out.println();
        }

    }
}
