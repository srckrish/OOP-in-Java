package lab5;

import java.io.RandomAccessFile;
import java.io.IOException;

public class EmployeeRecord {

	public static void main(String[] args) {

		try {
			RandomAccessFile file = new RandomAccessFile("employee.dat", "rw");

			// Create employee records
			file.writeInt(101);
			file.writeChars("Ram       ");
			file.writeDouble(25000);

			file.writeInt(102);
			file.writeChars("Shyam     ");
			file.writeDouble(30000);

			file.writeInt(103);
			file.writeChars("Hari      ");
			file.writeDouble(28000);

			// Each record size:
			// int = 4 bytes
			// name = 10 characters × 2 = 20 bytes
			// double = 8 bytes
			// Total = 32 bytes

			// Move to the second employee record
			file.seek(32);

			// Modify employee 102's salary
			file.writeInt(102);
			file.writeChars("Shyam     ");
			file.writeDouble(35000);

			System.out.println("Employee record modified successfully.");

			file.close();

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}