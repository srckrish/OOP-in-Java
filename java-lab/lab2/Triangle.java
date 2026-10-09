// 3. Write a program to print the area and perimeter of a
// triangle having sides of 3, 4 and 5 units by creating a
// class named 'Triangle' without any parameter in its constructor.

public class Triangle {

    double side1, side2, side3;

    // Constructor without any parameter
    Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    // Method to calculate area using Heron's formula
    double calculateArea() {
        double s = calculatePerimeter() / 2;  // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle();

        System.out.println("Sides: " + t1.side1 + ", " + t1.side2 + ", " + t1.side3);
        System.out.println("Perimeter: " + t1.calculatePerimeter() + " units");
        System.out.println("Area: " + t1.calculateArea() + " sq. units");
    }
}
