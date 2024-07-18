//Write a Java program to create a String object with a character array.

// package declaration
package lab_7;

public class StringObjectWithChar {

	public static void main(String[] args) {
		
		// declaring and initializing a character array
		char[] ch = {'A','k','a','n','k','s','h','a'};
		
		// creating a new String object from the character array
		String str = new String(ch);
		
		// printing the string
		System.out.println(str);

		// The output will be "Akanksha" because the String constructor is used to create a new String object from the character array.
        // This is one way to create a String object in Java, and it's useful when you need to work with character arrays.
		
	}

}

/*Dry run
 * 
 * Akanksha
 * 
 */
