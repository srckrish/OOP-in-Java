package lab6;

import java.util.*;

public class RemoveStartingWithA {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Apple");
		names.add("Banana");
		names.add("Amazon");
		names.add("Mango");
		names.add("Apple");
		names.add("Cat");

		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			String name = itr.next();

			if (name.startsWith("A")) {
				itr.remove();
			}
		}

		System.out.println("List after removal: " + names);
	}
}