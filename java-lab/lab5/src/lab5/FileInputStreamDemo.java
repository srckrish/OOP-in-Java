package lab5;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		// Try-with-resources automatically closes the file
		try (FileInputStream fis = new FileInputStream("sample.txt")) {

			int data;

			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
