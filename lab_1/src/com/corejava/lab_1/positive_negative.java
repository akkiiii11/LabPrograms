//Write a Java program to get a number from the user and print whether it is positive or negative.

package com.corejava.lab_1;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
	    
	    //Scanner is give the input from user
	    //scanner is a object of Scanner class
	    //new keyword used to create a class
	    //System is a java predefined class
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a number: ");  // used to print a line
        
        int num = scanner.nextInt();  //nextInt is used to scan the integer value which given from user
        
        
        //To check condition
        if (num > 0) {
            System.out.println("The number is positive.");
        } 
        
        else if (num < 0) {
            System.out.println("The number is negative.");
        } 
        
        else {
            System.out.println("The number is zero.");
        }

	}

}

/*Dry run
* Enter a number
* 11
* num = 11
* if(11>0)
* The number is Positive

* Enter a number
* -11
* num = -11
* if(-11<0)
* The number is Negative

* Enter a number
* 0
* num = 0
* The number is Zero
*/
