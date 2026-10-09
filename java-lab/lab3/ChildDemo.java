// 8. Create two interfaces named Father and Mother, each containing a method show(). Create a class Child that implements both interfaces and provides its own implementation of the show() method.
// In the main method, create an object of the Child class and call the show() method to demonstrate how Java resolves the Deadly Diamond of Death problem using interfaces.

interface Father {

    void show();
}

interface Mother {

    void show();
}

class Child implements Father, Mother {

    // Child must provide its own implementation since both
    // interfaces declare the same method signature
    @Override
    public void show() {
        System.out.println("Child's own implementation of show().");
    }
}

public class ChildDemo {

    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}
