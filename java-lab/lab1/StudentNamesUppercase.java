// 27. Write a Java program that stores the names of 5 students in a string array
// and display each student name in uppercase format.

import java.util.Scanner;

public class StudentNamesUppercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        System.out.println("Enter the names of 5 students:");

        for (int i = 0; i < names.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("Student names in uppercase:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].toUpperCase());
        }

        sc.close();
    }
}
