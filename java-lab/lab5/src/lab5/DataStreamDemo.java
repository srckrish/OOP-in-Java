package lab5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	public static void main(String[] args) {

		try {
			// Writing primitive data to the file
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));

			dos.writeInt(101);
			dos.writeDouble(85.5);
			dos.writeBoolean(true);
			dos.writeChar('A');
			dos.writeFloat(75.5f);

			dos.close();

			// Reading primitive data from the file
			DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"));

			int id = dis.readInt();
			double marks = dis.readDouble();
			boolean result = dis.readBoolean();
			char grade = dis.readChar();
			float percentage = dis.readFloat();

			dis.close();

			// Display the data
			System.out.println("ID: " + id);
			System.out.println("Marks: " + marks);
			System.out.println("Result: " + result);
			System.out.println("Grade: " + grade);
			System.out.println("Percentage: " + percentage);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
