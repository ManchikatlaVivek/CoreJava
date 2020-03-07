package io.javabrains.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Eclipse Installation\\workspace\\FileHandling\\d.txt");
			Scanner read = new Scanner(file);
			while (read.hasNextLine()) {
				System.out.println(read.nextLine());
			}
			read.close();
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
			e.printStackTrace();
		} finally {
			
		}

	}

}
