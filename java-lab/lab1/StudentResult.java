// 6. Write a program to check if a student has passed or not based on the input–and if the
// student has passed, check the student’s grade.

import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of student: ");
        float marks = sc.nextFloat();

        if (marks >= 40) {
            System.out.println("You have passed the exam.");

            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 80) {
                System.out.println("Grade: A-");
            } else if (marks >= 70) {
                System.out.println("Grade: B+");
            } else if (marks >= 60) {
                System.out.println("Grade: B");
            } else if (marks >= 50) {
                System.out.println("Grade: B-");
            } else {
                System.out.println("Grade: C+");
            }
        } else {
            System.out.println("You have not passed the exam.");
        }

        sc.close();
    }
}

// Output:
// Enter the marks of student:
// 82
// You have passed the exam.
// Grade: A-
