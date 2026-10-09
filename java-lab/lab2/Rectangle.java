// 4. Write a program to print the area of two rectangles having
// sides (4,5) and (5,8) respectively by creating a class named
// 'Rectangle' with a method named 'Area' which returns the area
// and length, breadth passed as parameters to its constructor.

public class Rectangle {

    double length, breadth;

    // Constructor with parameters
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return area
    double Area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);

        System.out.println("Rectangle 1 (4 x 5) -> Area: " + r1.Area());
        System.out.println("Rectangle 2 (5 x 8) -> Area: " + r2.Area());
    }
}
