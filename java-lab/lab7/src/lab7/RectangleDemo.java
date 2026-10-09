package lab7;

@FunctionalInterface
interface Rectangle {
	int area(int length, int breadth);
}

public class RectangleDemo {
	public static void main(String[] args) {

		Rectangle r = (length, breadth) -> length * breadth;

		System.out.println("Area of rectangle: " + r.area(10, 5));
	}
}