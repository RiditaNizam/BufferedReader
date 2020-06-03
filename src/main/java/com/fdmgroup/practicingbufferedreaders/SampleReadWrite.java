package com.fdmgroup.practicingbufferedreaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SampleReadWrite {

	public static void main(String[] args) {
		// Set up filename
		String currentDirectory = System.getProperty("user.dir");
		System.out.println("My directory is " + currentDirectory);
		String fullFileName = currentDirectory + "/abc.txt";
		System.out.println("My file path is " + fullFileName);

		ArrayList<String> linesList = new ArrayList();
		try {
			// Set up Buffered Reader
			FileReader fileReader = new FileReader(fullFileName); // Reads ONE CHARACTER at a time
			BufferedReader bufferedReader = new BufferedReader(fileReader); // Readers one LINE at a time

			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println("Just read: " + line);
				linesList.add(line);
			}

			bufferedReader.close(); // Close the file connection. Shut the file.
		} catch (Exception exception) {
			System.out.println("Something went wrong while reading the file.");
		}
	}
}