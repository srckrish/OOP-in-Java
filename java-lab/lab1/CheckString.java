// 28. Write a Java program to check whether a string given by the user starts
// with "a" or "A" and ends with "i" or "I".

import java.util.Scanner;

public class CheckString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        if (str.startsWith("a") && str.endsWith("i")) {
            System.out.println("The string starts with 'a' and ends with 'i'.");
        } else {
            System.out.println("The string does not satisfy the condition.");
        }

        sc.close();
    }
}
