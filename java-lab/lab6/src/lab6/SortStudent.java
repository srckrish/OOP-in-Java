package lab6;

import java.util.*;

class Student {
	int roll;
	String name;

	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public String toString() {
		return roll + " " + name;
	}
}

public class SortStudent {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(3, "Ram"));
		students.add(new Student(1, "Amit"));
		students.add(new Student(2, "Sita"));

		Collections.sort(students, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return s1.name.compareTo(s2.name);
			}
		});

		System.out.println("Students sorted by name:");

		for (Student s : students) {
			System.out.println(s);
		}
	}
}