//Write a Java program to get the character at the given index within the string.

// package declaration
package lab_7;

public class CharIndex {

	public static void main(String[] args) {
		
		// declaring and initializing a string variable
		String str = "Akanksha";
		
		// printing the original string
		System.out.println("Original String: " +str);
		
		// printing the character at index 1 (remember, indexing starts at 0)
		System.out.println("Character at index 1: " +str.charAt(1));
		
		// printing the character at index 8 (remember, indexing starts at 0)
		System.out.println("Character at index 8: " +str.charAt(7));
		
		// printing the character at index 5 (remember, indexing starts at 0)
		System.out.println("Character at index 5: " +str.charAt(5));

		// Note: In Java, the charAt() method returns the character at the specified index.
        // The index of the first character is 0, the index of the second character is 1, and so on.
	}

}

/* Dry Run
 
Original String: Akanksha
Character at index 1: k
Character at index 8: a
Character at index 5: s

*/
