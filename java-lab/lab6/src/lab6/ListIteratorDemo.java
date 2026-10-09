package lab6;

import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");
		list.add("Mango");

		ListIterator<String> itr = list.listIterator();

		// Forward traversal
		System.out.println("Forward traversal:");

		while (itr.hasNext()) {
			String fruit = itr.next();
			System.out.println(fruit);

			// Modify element
			if (fruit.equals("Banana")) {
				itr.set("Orange");
			}
		}

		// Backward traversal
		System.out.println("Backward traversal:");

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

		System.out.println("Modified list: " + list);
	}
}