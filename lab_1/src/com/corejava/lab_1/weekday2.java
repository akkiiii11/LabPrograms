//Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday na

package com.corejava.lab_1;

import java.util.Scanner;

public class weekday2 {
	public static void main(String args[])
	{
	    //Scanner is give the input from user
	    //scanner is a object of Scanner class
	    //new keyword used to create a class
	    //System is a java predefined class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number between 1 to 7 :");  //print a line
	
	    // n is intialized variable
		int n = sc.nextInt();             // Read the input number
		
		 // Use a switch statement to determine the corresponding weekday
		switch(n)                           
		{
		case 1:                            
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please enter number between 1 to 7");
			break;
		
		}
		
		// Close the Scanner object to prevent resource leaks
		sc.close();
	}
	

}

/* Dry Run
 * Enter an number between 1 to 7 :
 * 1
 * Monday
 * 
 * Enter an number between 1 to 7 :
 * 2
 * Tuesday
 * 
 * Enter an number between 1 to 7 :
 * 3
 * Wednesday
 * 
 * Enter an number between 1 to 7 :
 * 4
 * Thursday
 * 
 * Enter an number between 1 to 7 :
 * 5
 * Friday
 * 
 * Enter an number between 1 to 7 :
 * 6
 * Saturday
 * 
 * Enter an number between 1 to 7 :
 * 7
 * Sunday
 */
