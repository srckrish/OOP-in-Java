import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you class: ");
        /*
         * int classNumber = sc.nextInt();
         * Problem: nextInt() reads the number but leaves the \n.
         * The following nextLine() would consume that leftover \n.
         */

        /*
         * Solution 1 - nextInt() + extra nextLine():
         * sc.nextLine();
         */

        /*
         * Solution 2 - nextLine() + parsing:
         * nextLine() reads the whole line and consumes the \n.
         * parseInt() then converts the String into an int.
         */
        int className = Integer.parseInt(sc.nextLine());

        System.out.print("Enter you name: ");
        String name = sc.nextLine();

        System.out.println("Class: " + className);
        System.out.println("Name: " + name);
    }
}