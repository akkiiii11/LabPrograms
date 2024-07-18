//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

package com.lab_6;

// Class to check if a given number is odd or even
public class OddNumber {
	
	// Method to check the number and throw an exception if it is even
	void checkNumber(int n) {
		// Check if the number is even
		if(n % 2 == 0) {
			// If the number is even, throw an ArithmeticException
			throw new ArithmeticException(n + " is not an odd number.");
		} else {
			// If the number is odd, print a success message
			System.out.println(n + " is an odd number.");
		}
	}

	public static void main(String[] args) {
		// Create an instance of the OddNumber class
		OddNumber on = new OddNumber();
		
		try {
			// Call the checkNumber method with an input of 50
			on.checkNumber(50);
		} catch (ArithmeticException e) {
			// Catch the ArithmeticException and print an error message
			System.out.println("Number is checked.");
		}
	}
}

/*Dry Run 

Number is checked.

*/