//Write a Java program to test if a given string contains the specified sequence of char values.

//package declaration
package lab_7;

public class ContainsSequence {

	public static void main(String[] args) {
		
		// declaring and initializing two string variables
		String s1 = "My Name is Akanksha.";
		String s2 = "Akanksha";
		
		// using the contains() method to check if s1 contains s2
		System.out.println("Does s1 contains s2: " +s1.contains(s2));

		// The contains() method returns a boolean value: true if the string contains the specified sequence of characters, and false otherwise.
        // In this case, it checks if s1 contains the string "Akanksha" and returns true.

	}

}

/*Dry Run
 * Does s1 contains s2: true
*/