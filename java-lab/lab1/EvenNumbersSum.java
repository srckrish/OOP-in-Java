// 11. Write a program to print the sum of the first 10 even numbers.
public class EvenNumbersSum {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += num;
            num += 2;
        }
        System.out.println("Sum: " + sum);
    }
}

// Output:
// Sum: 90
