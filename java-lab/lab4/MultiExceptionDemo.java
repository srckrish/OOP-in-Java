// 2.Write a complete Java program that demonstrates exception handling
// for multiple scenarios: division by zero, array index out of bounds, null
// string access. Use a single try block with multiple catch blocks and a
// finally block

public class MultiExceptionDemo {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        String text = null;
        int choice = 1;  // Change this value (1, 2, or 3) to trigger different exceptions

        try {
            System.out.println("Starting operations...");

            if (choice == 1) {
                // Scenario 1: Division by zero
                int result = numbers[0] / 0;
                System.out.println("Result: " + result);

            } else if (choice == 2) {
                // Scenario 2: Array index out of bounds
                System.out.println("Accessing index 5: " + numbers[5]);

            } else if (choice == 3) {
                // Scenario 3: Null string access
                System.out.println("String length: " + text.length());
            }

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());

        } catch (Exception e) {
            // Generic catch, handles any other unexpected exception
            System.out.println("An unexpected exception occurred: " + e.getMessage());

        } finally {
            System.out.println("Finally block executed, cleanup happens here.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
