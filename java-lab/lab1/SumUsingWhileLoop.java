// 9. Write a program to print the sum of the first 10 natural numbers using a while loop.

public class SumUsingWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("Sum: " + sum);
    }
}

// Output:
// Sum: 55