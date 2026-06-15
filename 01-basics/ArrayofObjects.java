class Student {
    String name;
    int marks;
}

public class ArrayofObjects {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Krish";
        s1.marks = 92;
        Student s2 = new Student();
        s2.name = "Kiran";
        s2.marks = 58;

        Student s3 = new Student();
        s3.name = "Karan";
        s3.marks = 82;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].marks);
        }
    }
}