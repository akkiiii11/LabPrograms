//Write a Java program to find numbers less than 7 in a tree set.

package com.collection.lab_8;

// Import necessary classes for working with collections
import java.util.TreeSet;

// Class to demonstrate finding numbers less than 7 in a TreeSet
public class FindNumbersLessThan7TreeSet {

	// Main method to execute the program
	public static void main(String[] args) {
		// Create a TreeSet to store unique integers in sorted order
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		// Add elements to the TreeSet
		set.add(5);
		set.add(3);
		set.add(7);
		set.add(10);
		set.add(8);
		set.add(6);
		set.add(7); // Duplicate element, will be ignored
		set.add(20);
		set.add(4);
		set.add(1);
		set.add(11);
		
		// Print the TreeSet
		System.out.println("TreeSet: " + set);
		
		// Print the numbers less than 7
		System.out.println("Numbers less than 7: ");
		
		// Use a for-each loop to iterate over the TreeSet
		for(int num : set) {
			// Check if the number is less than 7
			if(num < 7) {
				// Print the number
				System.out.println(num);
			}
		}
	}
}

/*Dry Run 

TreeSet: [1, 3, 4, 5, 6, 7, 8, 10, 11, 20]
Numbers less than 7: 
1
3
4
5
6

*/
