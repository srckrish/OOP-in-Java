// 7. Write a program to print the area of a rectangle by
// creating a class named “Area” taking the values of length
// and breadth as parameters of its constructor and having
// a method named ‘returnArea’ which returns the area of
// the rectangle. Length and breadth are entered through
// the keyboard.

import java.util.Scanner;

public class Area {

    double length, breadth;

    // Constructor with parameters
    Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area
    double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Area rect = new Area(l, b);

        System.out.println("Area of Rectangle: " + rect.returnArea());

        sc.close();
    }
}
