//Write a Java program to sort a given array list.

package com.collection.lab_8;

// Import necessary classes for working with collections
import java.util.ArrayList;
import java.util.Collections;

// Class to demonstrate sorting of an ArrayList
public class SortArrayList {

	// Main method to execute the program
	public static void main(String[] args) {
		// Create an ArrayList to store strings
		ArrayList<String> list = new ArrayList<String>();
		
		// Add elements to the ArrayList
		list.add("Akanksha");
		list.add("Sunny");
		list.add("Nivedita");
		list.add("Shriyank");
		
		// Print the ArrayList before sorting
		System.out.println("Before Sorting: " + list);
		
		// Use the Collections.sort() method to sort the ArrayList
		Collections.sort(list);
		
		// Print the ArrayList after sorting
		System.out.println("After Sorting: " + list);
	}
}

/*Dry Run

Before Sorting: [Akanksha, Sunny, Nivedita, Shriyank]
After Sorting: [Akanksha, Nivedita, Shriyank, Sunny]

*/