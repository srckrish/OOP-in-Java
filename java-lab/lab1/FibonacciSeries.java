// 14. Write a program to print the fibonacci series up to 10th term starting from 100, 101.

public class FibonacciSeries {
    public static void main(String[] args) {

        int a = 100;
        int b = 101;
        int c;

        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

// Output:
// 100 101 201 302 503 805 1308 2113 3421 5534