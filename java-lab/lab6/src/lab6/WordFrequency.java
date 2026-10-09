package lab6;

import java.util.*;

public class WordFrequency {
	public static void main(String[] args) {

		String text = "java is easy java is powerful";

		HashMap<String, Integer> map = new HashMap<>();

		String[] words = text.split(" ");

		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		System.out.println("Word Frequencies:");

		for (String word : map.keySet()) {
			System.out.println(word + " : " + map.get(word));
		}
	}
}