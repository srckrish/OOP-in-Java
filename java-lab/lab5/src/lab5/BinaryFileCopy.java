package lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileCopy {

	public static void main(String[] args) {

		String source = "source.jpg";
		String destination = "copy.jpg";

		try {
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(destination);

			int data;

			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

			fis.close();
			fos.close();

			System.out.println("Binary file copied successfully.");

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
