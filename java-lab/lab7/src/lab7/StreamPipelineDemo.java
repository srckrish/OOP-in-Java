package lab7;

import java.util.*;

public class StreamPipelineDemo {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		numbers.stream().filter(n -> n % 2 == 0) // Filter even numbers
				.map(n -> n * n) // Square the numbers
				.forEach(n -> System.out.println(n)); // Print results
	}
}