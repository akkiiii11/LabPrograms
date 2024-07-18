//Write a Java program to create a method that reads a file and throws an exception if the file is not found.

package com.lab_6;

// Import necessary classes for file input/output operations
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Class to read and print the contents of a file
public class ReadFileMain {
	
	// Main method to execute the program
	public static void main(String[] args) throws IOException {
		// Try block to execute the code that may throw an exception
		try {
			// Create a BufferedReader object to read the file
			BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
			
			// Initialize a string variable to store the read data
			String data = null;
			
			// Loop to read the file line by line
			while((data = br.readLine()) != null) {
				// Print the read data
				System.out.println(data);
			}
		} 
		// Catch block to handle the FileNotFoundException
		catch(FileNotFoundException e) {
			// Print an error message if the file is not found
			System.out.println("File is Not Found.");
		}
	}
}


/*Dry Run

File is Not Found.

*/