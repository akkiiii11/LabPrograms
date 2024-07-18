//Write a Java program that throws an exception and catch it using a try-catch block.

package com.lab_6;

// Class to demonstrate the use of try-catch blocks for exception handling
public class ThrowsMain {

	public static void main(String[] args) {
		// Try block to execute the code that may throw an exception
		try {
			// Initialize two integer variables
			int a = 10, b = 0;
			// Attempt to divide a by b, which will throw an ArithmeticException
			int res = a / b;
			// Print the result, but this line will not be executed if an exception is thrown
			System.out.println("Result is:" + res);
		} 
		// Catch block to handle the ArithmeticException
		catch (ArithmeticException e) {
			// Print an error message when the exception is caught
			System.out.println("Cannot divide by zero.");
		}
	}
}

/*Dry Run 

Cannot divide by zero.

*/