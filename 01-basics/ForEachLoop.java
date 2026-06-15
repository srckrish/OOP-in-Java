class Student {
    String name;
    int marks;
}

public class ForEachLoop {
    public static void main(String args[]) {
        int nums[] = new int[4];
        nums[0] = 5;
        nums[1] = 15;
        nums[2] = 112;
        nums[3] = 16;

        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }

        for (int i : nums) {
            System.out.println(i);
        }

        Student s1 = new Student();
        s1.name = "Krish";
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Karan";
        s2.marks = 85;

        Student s3 = new Student();
        s3.name = "Kelvin";
        s3.marks = 78;

        // Student students[] = new Student[3];

        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        Student students[] = { s1, s2, s3 };

        for (Student s : students) {
            System.out.println(s.name + " " + s.marks);
        }
    }

}
