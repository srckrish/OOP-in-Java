// 7. Java does not support multiple inheritance through classes because it can lead to the Deadly Diamond of Death problem. However, Java allows multiple inheritance through interfaces.

interface InterfaceB {

    default void greet() {
        System.out.println("Hello from InterfaceB");
    }
}

interface InterfaceC {

    default void greet() {
        System.out.println("Hello from InterfaceC");
    }
}

// ClassD implements both — this WON'T compile without an override
class ClassD implements InterfaceB, InterfaceC {

    // Mandatory: must override to resolve the conflict
    @Override
    public void greet() {
        // Explicitly choose one, both, or write custom logic
        InterfaceB.super.greet();
        InterfaceC.super.greet();
        System.out.println("Custom greet() in ClassD");
    }
}

public class DiamondDemo {

    public static void main(String[] args) {
        ClassD obj = new ClassD();
        obj.greet();
    }
}
