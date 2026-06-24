// Write to program print the sum of the first 10 natural numbers using do while loop.
public class SumUsingDoLoop {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        do {
            sum += num;
            num++;
        } while (num <= 10);
        System.out.println("Sum: " + sum);
    }
}

// Output:
// Sum: 55