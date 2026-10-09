
public class test {

    public static void main(String[] args) {
        int[][] numbers = new int[5][];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new int[i + 1];
        }

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = count++;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
