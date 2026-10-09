// 6. Write two different programs to swap two values using pass by value and pass by reference.
// PROGRAM 1: Pass by Value (using primitives)
public class SwapByValue {

    // Method receives a COPY of the values
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap() -> a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("Before swap -> x: " + x + ", y: " + y);

        swap(x, y);

        System.out.println("After swap -> x: " + x + ", y: " + y);
    }
}
