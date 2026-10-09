package lab6;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {

		// Create HashSet
		HashSet<String> set = new HashSet<>();

		// Add elements
		set.add("Apple");
		set.add("Banana");
		set.add("Mango");

		// Add duplicate element
		set.add("Apple");

		// Check if an element exists
		if (set.contains("Banana")) {
			System.out.println("Banana exists in the set.");
		}

		// Remove an element
		set.remove("Mango");

		// Display the set
		System.out.println("Set: " + set);

		// Display size
		System.out.println("Size of set: " + set.size());
	}
}