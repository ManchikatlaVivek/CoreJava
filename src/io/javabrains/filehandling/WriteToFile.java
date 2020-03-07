package io.javabrains.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\Eclipse Installation\\workspace\\FileHandling\\d.txt");
			writer.write("This is a temp file with random input written using filewriter class");
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
