//Write a Java program to get the first and last occurrence of the specified elements in a linked list.

package com.collection.lab_8;

// Import necessary classes for working with collections
import java.util.LinkedList;

// Class to demonstrate finding the first and last occurrence of an element in a LinkedList
public class FirstLastOccurrenceLinkedList {

	// Main method to execute the program
	public static void main(String[] args) {
		// Create a LinkedList to store a list of strings
		LinkedList<String> list = new LinkedList<String>();
		
		// Add elements to the LinkedList
		list.add("Akanksha");
		list.add("Sunny");
		list.add("Nivedita");
		list.add("Shriyank");
		list.add("Ajay");
		list.add("Siya");
		list.add("Vijay");
		list.add("Mahesh");
		
		// Print the LinkedList
		System.out.println("LinkedList: " + list);
		
		// Find the first occurrence of the element at index 4 (which is "Ajay")
		System.out.println("First Occurrence of 4: " + list.indexOf("Ajay"));
		
		// Find the last occurrence of the element at index 4 (which is "Ajay")
		System.out.println("Last Occurrence of 4: " + list.lastIndexOf("Ajay"));
	}
}

/*Dry Run 

LinkedList: [Akanksha, Sunny, Nivedita, Shriyank, Ajay, Siya, Vijay, Mahesh]
First Occurrence of 4: 4
Last Occurrence of 4: 4

*/