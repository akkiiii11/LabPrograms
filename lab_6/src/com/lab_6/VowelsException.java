//Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels

package com.lab_6;

import java.io.IOException;

// Class to check if a string contains vowels
public class VowelsException {
    // Instance variable to store the input string
    String s;

    // Method to check if a string contains vowels
    void vowelsCheck(String s) throws IOException {
        // Assign the input string to the instance variable
        this.s = s;
        // Flag to indicate if the string contains vowels
        boolean hasVowels = false; 

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Check if the character is a vowel (both uppercase and lowercase)
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
                // If a vowel is found, set the flag to true and break out of the loop
                hasVowels = true;
                break; 
            }
        }

        // If the string does not contain any vowels, throw an IOException
        if (!hasVowels) {
            throw new IOException("The String does not contain any vowels.");
        } else {
            // If the string contains vowels, print a success message
            System.out.println("The string contains vowels.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the VowelsException class
        VowelsException ve = new VowelsException();

        try {
            // Call the vowelsCheck method with a test string
            ve.vowelsCheck("wynk");
        } catch (IOException e) {
            // Catch the IOException and print an error message
            System.out.println("The String does not contain any vowels.");
        }
    }
}

/*Dry Run

The String does not contain any vowels.

*/