package com.lab_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true)
		{
			try
			{
				System.out.println("Please Enter an Integer. ");
				n = sc.nextInt();
				System.out.println("You entered: " + n);
				break;
			}
			
			catch(InputMismatchException e)
			{
				System.out.println("Invalid Input. Please enter an integer.");
				sc.nextLine();
			}
		}

	}

}
