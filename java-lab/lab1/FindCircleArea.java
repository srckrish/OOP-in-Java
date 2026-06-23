// 3. Write a program to calculate the area of a circle.
import java.util.Scanner;

public class FindCircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * (radius * radius);

        System.out.printf("The area of the circle is:  %.3f", area);

        sc.close();
    }
}

// Output:
// Enter the radius of the circle: 5
// The area of the circle is:  78.540