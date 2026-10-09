package lab5;

import java.io.Console;

public class PasswordInput {

	public static void main(String[] args) {

		Console console = System.console();

		if (console == null) {
			System.out.println("Console is not available.");
			return;
		}

		// Read password without echoing
		char[] password = console.readPassword("Enter password: ");

		System.out.println("Password entered successfully.");

		// Clear password from memory after use
		java.util.Arrays.fill(password, ' ');
	}
}
