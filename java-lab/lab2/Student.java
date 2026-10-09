// 1. Write a program in Java to count the number of objects
// created by using static data and use of default constructor.

public class Student {

    // Static variable - shared across all objects, not per-object
    static int count = 0;

    // Default constructor
    Student() {
        count++;  // Increment the shared counter each time an object is created
        System.out.println("Object " + count + " created");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Total number of objects created: " + Student.count);
    }
}
