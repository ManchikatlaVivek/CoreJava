package io.javabrains.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {

		File myfile = new File("C:\\Eclipse Installation\\workspace\\FileHandling\\newFile.txt");
		try {
			if (myfile.createNewFile()) {
				System.out.println("File is created");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("File not found Exception");
			e.printStackTrace();
		}

	}

}
