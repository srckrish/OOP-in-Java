package lab5;

import java.io.File;

public class DirectoryList {

	public static void main(String[] args) {

		// Specify the directory path
		File directory = new File(".");

		// Get all files and subdirectories
		File[] files = directory.listFiles();

		if (files != null) {
			System.out.println("Files and Subdirectories:");

			for (File file : files) {

				if (file.isFile()) {
					System.out.println("File: " + file.getName());

				} else if (file.isDirectory()) {
					System.out.println("Directory: " + file.getName());
				}
			}

		} else {
			System.out.println("Directory does not exist or cannot be accessed.");
		}
	}
}
