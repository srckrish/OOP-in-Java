package lab5;

import java.io.Serializable;

public class Student implements Serializable {

	private int roll;
	private String name;
	private double marks;

	// Constructor
	public Student(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	// Display student information
	public void display() {
		System.out.println("Roll: " + roll);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}

	public static void main(String[] args) {

		Student s = new Student(101, "Krish", 85.5);

		s.display();
	}
}