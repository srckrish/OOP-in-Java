package lab5;

import java.io.*;

public class FileStreamDemo {

    public static void main(String[] args) {

        try {
            // Writing to a file
            Writer writer = new FileWriter("input.txt");

            writer.write("Hello, this is a Java file handling program.\n");
            writer.write("We are using Reader and Writer stream classes.\n");
            writer.write("Java provides several subclasses of Reader and Writer.");

            writer.close();

            // Reading from the file
            Reader reader = new FileReader("input.txt");

            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
