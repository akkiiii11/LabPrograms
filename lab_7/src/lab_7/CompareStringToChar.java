//Write a Java program to compare a given string to the specified character sequence.

// package declaration
package lab_7;

public class CompareStringToChar {

	public static void main(String[] args) {

		// declaring and initializing two string variables
		String str1 = "Color of Mango is Yellow.";
		String str2 = "Color of Banana is Yellow.";
		
		// declaring and initializing a CharSequence variable
		CharSequence cs = "Color of Mango is Yellow.";
		
		// using the equals() method to compare str1 with cs
		System.out.println("Compare String to CharSequence1: " +str1.equals(cs));
		
		// The equals() method returns true if the string is equal to the specified CharSequence, and false otherwise.
        // In this case, it checks if str1 is equal to cs and returns true because they have the same characters.
		
		
		// using the equals() method to compare str2 with cs
        System.out.println("Compare String to CharSequence2: " + str2.equals(cs));
        
        // The equals() method returns false because str2 is not equal to cs, they have different characters ("Mango" vs "Banana").
    }

}

/*Dry Run

Compare String to CharSequence1: true
Compare String to CharSequence2: false

*/