// 2. Create a class named 'Student' with String variable 'name'
// and integer variable 'roll_number'. Assign the value of
// roll_number as 2 and name as 'John' by creating an object.

class Student {

    String name;
    int roll_number;

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "John";
        student.roll_number = 2;

        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.roll_number);
    }
}
