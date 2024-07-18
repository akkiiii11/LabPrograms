//Write a Java program that takes three numbers from the user and prints the greatest number.

package com.corejava.lab_1;

import java.util.Scanner;

public class gretest_no {

	public static void main(String[] args) {
	    

                //Scanner is give the input from user
	            //scanner is a object of Scanner class
	            //new keyword used to create a class
	            //System is a java predefined class
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the first number: ");   // to print a line
		        int num1 = scanner.nextInt();                   // //nextInt is used to scan the integer value which given from user
		        
		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();
		        
		        System.out.print("Enter the third number: ");
		        int num3 = scanner.nextInt();
		        
		        if (num1>num2 & num1>num2)
		        {
		        	System.out.println("The greatest number is: " +num1);
		        }
		        
		        else if (num2>num1 & num2>num3)
		        {
		        	System.out.println("The greatest number is: " +num2);
		        }
		        
		        else
		        {
		        	System.out.println("The greatest number is: " +num3);
		        }
		        
		    }
}

/*Dry run
 * Enter the first number: 5
 * num1 = 5
 * Enter the second number: 10
 * num2 = 10
 * Enter the third number: 30
 * num3 = 30
 * 5>10 and 5>30 (condition False)
 * 10>5 and 10>30 (condition False)
 * else
 * The greatest number is: 30
 */
