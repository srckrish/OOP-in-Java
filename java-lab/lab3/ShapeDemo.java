// 2. Create a class named ‘Shape’ with a method to print “This is shape”. Then create two other classes named ‘Rectangle’, ‘Circle’ inheriting the Shape class, both having a method to print “This shape is rectangle” and “This shape is circle” respectively. Create a subclass ‘Square’ of ‘Rectangle’ having a method to print ‘Square is a rectangle’. Now call the method of ‘Shape’ and ‘Rectangle’ class by the object of ‘Square’ class.
// Create a class named ‘Shape’ with a method to print “This is shape”. Then create two other classes named ‘Rectangle’, ‘Circle’ inheriting the Shape class, both having a method to print “This shape is rectangle” and “This shape is circle” respectively. Create a subclass ‘Square’ of ‘Rectangle’ having a method to print ‘Square is a rectangle’. Now call the method of ‘Shape’ and ‘Rectangle’ class by the object of ‘Square’ class.

class Shape {

    void showShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {

    void showRectangle() {
        System.out.println("This shape is rectangle");
    }
}

class Circle extends Shape {

    void showCircle() {
        System.out.println("This shape is circle");
    }
}

class Square extends Rectangle {

    void showSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class ShapeDemo {

    public static void main(String[] args) {
        Square square = new Square();

        square.showShape();     // inherited from Shape
        square.showRectangle(); // inherited from Rectangle
        square.showSquare();    // Square's own method
    }
}
