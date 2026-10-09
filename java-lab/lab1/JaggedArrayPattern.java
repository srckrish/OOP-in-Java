// 26. Write a Java program to print the following pattern using a jagged array.

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
public class JaggedArrayPattern {

    public static void main(String[] args) {

        int[][] numbers = new int[5][];

        // Creating each row with different size
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new int[i + 1];
        }

        // Assigning values
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = j + 1;
            }
        }

        // Displaying the pattern
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
