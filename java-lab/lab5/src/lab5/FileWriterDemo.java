package lab5;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

        try {
            // Writing a string to the file
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("This is the first line.\n");
            writer.write("This text is written using FileWriter.\n");

            writer.close();

            // Appending text to the existing file
            FileWriter appendWriter = new FileWriter("sample.txt", true);

            appendWriter.write("This line is appended to the existing file.\n");
            appendWriter.write("The old content is not deleted.");

            appendWriter.close();

            System.out.println("File written and appended successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
