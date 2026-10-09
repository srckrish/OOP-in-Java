public class VariableTypes {
    static class LocalVariable {
        void display() {
            String name = "John";
            System.out.println("Name: " + name);
        }
    }

    static class InstanceVariable {
        String name;
        int age;
    }

    static class StaticVariable {
        static double PI = 3.14;
    }

    public static void main(String[] args) {
        System.out.println("Local Variable");
        LocalVariable local = new LocalVariable();
        local.display();

        System.out.println();
        System.out.println("Instance Variable");
        InstanceVariable user1 = new InstanceVariable();
        user1.name = "Krish";
        user1.age = 10;
        System.out.println(user1.name + ", " + user1.age);

        InstanceVariable user2 = new InstanceVariable();
        user2.name = "John";
        user2.age = 50;
        System.out.println(user2.name + ", " + user2.age);

        System.out.println();
        System.out.println("Static Variable");
        System.out.println(StaticVariable.PI);

    }

}
