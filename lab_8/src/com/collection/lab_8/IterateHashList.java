//Write a Java program to iterate through all elements in a hash list.

package com.collection.lab_8;

// Import necessary classes for working with collections
import java.util.HashSet;
import java.util.Iterator;

// Class to demonstrate iteration over a HashSet
public class IterateHashList {

	// Main method to execute the program
	public static void main(String[] args) {
		// Create a HashSet to store unique strings
		HashSet<String> set = new HashSet<String>();
		
		// Add elements to the HashSet
		set.add("JAVA");
		set.add("Python");
		set.add("C-programming");
		set.add("C++");
		set.add("HTML");
		
		// Print the HashSet
		System.out.println("HashSet: " + set);
		
		// Create an Iterator to iterate over the HashSet
		Iterator<String> iterator = set.iterator();
		
		// Loop to iterate over the HashSet
		while(iterator.hasNext()) {
			// Get the next element from the iterator
			String element = iterator.next();
			// Print the element
			System.out.println(element);
		}
	}
}

/*Dry Run

HashSet: [JAVA, C++, C-programming, HTML, Python]
JAVA
C++
C-programming
HTML
Python

*/