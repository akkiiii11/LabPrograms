//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

package com.corejava.lab_1;

import java.util.Scanner;

public class sum_average {

	    public static void main(String[] args) {
	    	
	    	 // Create a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);
	        
	        int sum = 0;	// Initialize sum to 0
	        
	     // Loop to read 5 numbers from the user
	        for (int i = 1; i <= 5; i++) {
	        	
	            System.out.print("Enter number " + i + ": ");
	            
	            int num = scanner.nextInt();	// Read the next integer input
	            
	            sum = sum+num;		// Add the input to the sum
	        }
	        
	     // Calculate the average
	        int average = sum / 5;		// Use 5.0 to perform floating-point division
	        
	     // Print the sum and average
	        System.out.println("The sum of the 5 numbers is: " + sum);
	        
	        System.out.println("The average of the 5 numbers is: " + average);
	    
	    }
}

/*Dry Run
 * 
 * Enter number 1: 1
 * num = 1
 * Enter number 2: 2
 * num = 2
 * Enter number 3: 3
 * num = 3
 * Enter number 4: 4
 * num = 4
 * Enter number 5: 5
 * num = 5
 * 
 * sum = 1+2+3+4+5
 * sum = 15
 * The sum of the 5 numbers is: 15
 * The average of the 5 numbers is: 3

 */
