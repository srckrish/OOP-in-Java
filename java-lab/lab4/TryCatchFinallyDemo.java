// 1. Write a Java program that demonstrates try, catch, and finally blocks.

public class TryCatchFinallyDemo {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Attempting division...");
            int result = numbers[1] / 0;  // This will throw ArithmeticException
            System.out.println("Result: " + result);  // Never reached
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed, this always runs.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
