//Write a Java program to check whether a given string ends with another string.

// package declaration
package lab_7;

public class EndsAnotherString {

    public static void main(String[] args) {
        
        // declaring and initializing two string variables
        String s1 = "I am a Akanksha";
        String s2 = "Akanksha";
        
        // using the endsWith() method to check if s1 ends with s2
        System.out.println("s1 end with s2: " + s1.endsWith(s2));
        
        // The endsWith() method returns true if the string ends with the specified suffix, and false otherwise.
        // In this case, it checks if s1 ends with s2 and returns true because "I am a Akanksha" ends with "Akanksha".
        
        // using the endsWith() method to check if s1 ends with "Ak"
        System.out.println("s1 end with s2: " + s1.endsWith("Ak"));
        
        // The endsWith() method returns false because "I am a Akanksha" does not end with "Ak", it ends with "Akanksha".
    }

}

/*Dry run

s1 end with s2: true
s1 end with s2: false

*/