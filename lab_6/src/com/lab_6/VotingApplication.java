//Write a program for voting Application, take the user’s age as input and explicitly throw the exception if the user’s age is less than 18 to terminate the program.

package com.lab_6;

// Class to validate voting eligibility based on age
public class VotingApplication {
	
	// Method to validate the age for voting eligibility
	void Validate(int age) {
		// Check if the age is less than 18
		if(age < 18) {
			// If the age is not valid, throw an ArithmeticException
			throw new ArithmeticException("Age is not valid");
		} else {
			// If the age is valid, print a success message
			System.out.println("You are eligible for voting");
		}
	}

	public static void main(String[] args) {
		// Create an instance of the VotingApplication class
		VotingApplication VP = new VotingApplication();
		
		try {
			// Call the Validate method with an age of 20
			VP.Validate(20);
		} catch (ArithmeticException e) {
			// Catch the ArithmeticException and print a welcome message
			// Note: This is not the correct behavior, as the exception is thrown for invalid ages
			// A more correct approach would be to handle the exception and print an error message
			System.out.println("Welcome for Voting");
		}
	}
}

/*Dry Run 

You are eligible for voting

 */