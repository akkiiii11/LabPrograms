package com.corejava.lab_1;

import java.util.Scanner;

public class cube_n_no {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number :");
		int n = sc.nextInt();
		System.out.println("Cube of numbers up to:" +n);
		for(int i=1;i<=n ;i++)
		{
			int cube = i *i*i;
		
		
		System.out.println("Cube of " + i + " is "+ cube);
		}

	}

}
