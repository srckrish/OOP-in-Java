package lab6;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {

		// Create HashMap
		HashMap<Integer, String> map = new HashMap<>();

		// Put key-value pairs
		map.put(1, "Ram");
		map.put(2, "Sita");
		map.put(3, "Hari");

		// Get value by key
		System.out.println("Value of key 2: " + map.get(2));

		// Iterate over keys and values
		System.out.println("Key and Value:");

		for (Integer key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}

		// Remove an entry
		map.remove(3);

		System.out.println("After removing key 3: " + map);
	}
}