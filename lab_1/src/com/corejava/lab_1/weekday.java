package com.corejava.lab_1;

import java.util.Scanner;

public class weekday {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number between 1 to 7 :");
		int n = sc.nextInt();
		String Week[]={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		if (n >= 1 && n <= 7)
		{
			System.out.println("The corresponding weekday name is: " + Week[n- 1]);
		}
		else
		{
			System.out.println("Please enter number between 1 to 7");
		}
	}

}
