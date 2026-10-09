package lab5;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.IOException;

public class ConsoleIO {

	public static void main(String[] args) {

		try {
			// Read input from console
			InputStreamReader isr = new InputStreamReader(System.in);

			BufferedReader br = new BufferedReader(isr);

			// Write output using PrintStream
			PrintStream ps = System.out;

			ps.print("Enter your name: ");
			String name = br.readLine();

			ps.print("Enter your age: ");
			int age = Integer.parseInt(br.readLine());

			ps.println("\nName: " + name);
			ps.println("Age: " + age);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
