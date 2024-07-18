//Write a Java program to count the number of key-value (size) mappings in a map.

package com.collection.lab_8;

// Import necessary classes for working with collections
import java.util.HashMap;
import java.util.Map;

// Class to demonstrate creating and accessing a HashMap
public class CountKeyMapping {

	// Main method to execute the program
	public static void main(String[] args) {
		// Create a HashMap to store key-value pairs
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// Put key-value pairs into the HashMap
		map.put("Java", 3); // Key: "Java", Value: 3
		map.put("Python", 5); // Key: "Python", Value: 5
		map.put("C++", 2); // Key: "C++", Value: 2
		map.put("HTML", 4); // Key: "HTML", Value: 4
		map.put("PHP", 9); // Key: "PHP", Value: 9
		map.put("JavaScript", 7); // Key: "JavaScript", Value: 7
		map.put("NodeJs", 6); // Key: "NodeJs", Value: 6
		
		// Print the HashMap
		System.out.println("HashMap: " + map);
		
		// Print the size of the HashMap (number of key-value pairs)
		System.out.println("Size of HashMap: " + map.size());
	}
}

/*Dry Run 

HashMap: {Java=3, C++=2, JavaScript=7, PHP=9, HTML=4, NodeJs=6, Python=5}
Size of HashMap: 7


*/