package lab7;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {

		// ofNullable() allows null values
		String name = null;
		Optional<String> optionalName = Optional.ofNullable(name);

		// isPresent() checks whether a value exists
		if (optionalName.isPresent()) {
			System.out.println("Name is present.");
		} else {
			System.out.println("Name is not present.");
		}

		// ifPresent() executes only if a value exists
		optionalName.ifPresent(n -> System.out.println("Name: " + n));

		// orElse() provides a default value if value is null
		String result = optionalName.orElse("Unknown");

		System.out.println("Name: " + result);
	}
}