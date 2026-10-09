// 6. Write two different programs to swap two values using pass by value and pass by reference.
// PROGRAM 2: Pass by Reference (simulated using an object)

public class SwapByReference {

    // Wrapper class to hold values inside an object
    static class Pair {

        int a, b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    // Method receives a reference to the SAME object
    static void swap(Pair p) {
        int temp = p.a;
        p.a = p.b;
        p.b = temp;
        System.out.println("Inside swap() -> a: " + p.a + ", b: " + p.b);
    }

    public static void main(String[] args) {
        Pair pair = new Pair(10, 20);
        System.out.println("Before swap -> a: " + pair.a + ", b: " + pair.b);

        swap(pair);

        System.out.println("After swap -> a: " + pair.a + ", b: " + pair.b);
    }
}
