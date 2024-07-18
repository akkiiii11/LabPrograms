// a Java program to concatenate a given string to the end of another string.

// package declaration
package lab_7;

public class ConcatenateToAnotherString {

	public static void main(String[] args) {
		
		// declaring and initializing two string variables
		String s1 = "My Name is Akanksha. ";
		String s2 = "Basically I am from Satara.";
		
		// using the concat() method to concatenate s2 to s1
		System.out.println("The Concatenated String is: " +s1.concat(s2));

		// The concat() method returns a new string that is a combination of the original string and the string passed as an argument.
        // In this case, it concatenates s2 to the end of s1 and returns the resulting string.
	}

}

/* Dry Run
 
The Concatenated String is: My Name is Akanksha. Basically I am from Satara.

*/