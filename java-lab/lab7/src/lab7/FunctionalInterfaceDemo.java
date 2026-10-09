package lab7;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ram", "Sita", "Hari", "Amit");

		// Predicate<T> - filter names starting with A
		Predicate<String> predicate = name -> name.startsWith("A");

		System.out.println("Filtered names:");
		for (String name : names) {
			if (predicate.test(name)) {
				System.out.println(name);
			}
		}

		// Function<T,R> - convert name to uppercase
		Function<String, String> function = name -> name.toUpperCase();

		System.out.println("\nConverted name:");
		System.out.println(function.apply("ram"));

		// Consumer<T> - print a name
		Consumer<String> consumer = name -> System.out.println("Name: " + name);

		System.out.println("\nConsumer:");
		consumer.accept("Sita");

		// Supplier<T> - generate a value
		Supplier<String> supplier = () -> "Generated Value";

		System.out.println("\nSupplier:");
		System.out.println(supplier.get());
	}
}