// 1. Create a class named ‘Rectangle’ with two data members ‘length’ and ‘breadth’ and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class ‘square’ inherit the ‘Rectangle’ class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as ‘super(s,s)’. Print the area and perimeter of a rectangle and a square.

class Rectangle {

    double length;
    double breadth;

    // Constructor to initialize length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print area
    void printArea() {
        double area = length * breadth;
        System.out.println("Area = " + area);
    } 

    // Method to print perimeter
    void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter = " + perimeter);
    }
}

class Square extends Rectangle {

    // Constructor with parameter for side, calls parent constructor
    Square(double s) {
        super(s, s);
    }
}

public class Main {

    public static void main(String[] args) {
        // Rectangle object
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Rectangle:");
        rect.printArea();
        rect.printPerimeter();

        System.out.println();

        // Square object
        Square sq = new Square(4);
        System.out.println("Square:");
        sq.printArea();
        sq.printPerimeter();
    }
}
