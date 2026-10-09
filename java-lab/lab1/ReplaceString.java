
import java.util.Scanner;

public class ReplaceString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the string to replace: ");
        String oldStr = sc.nextLine();

        str = str.replace(oldStr, "java");

        System.out.println("Result: " + str);

        sc.close();
    }
}
