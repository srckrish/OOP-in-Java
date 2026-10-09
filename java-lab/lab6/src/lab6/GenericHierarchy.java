package lab6;

class Box<T> {
	T value;

	Box(T value) {
		this.value = value;
	}

	void display() {
		System.out.println("Value: " + value);
	}
}

class NumberBox<T extends Number> extends Box<T> {

	NumberBox(T value) {
		super(value);
	}

	void square() {
		System.out.println("Square: " + value.doubleValue() * value.doubleValue());
	}
}

public class GenericHierarchy {
	public static void main(String[] args) {

		NumberBox<Integer> obj = new NumberBox<>(10);

		obj.display();
		obj.square();
	}
}