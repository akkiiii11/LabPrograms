//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.

package com.corejava.lab_2;

public class Book {
    String title;
    String author;
    String ISBN;

 // Constructor to initialize a Book object
    public Book(String t1, String a1, String isbn) {
        title = t1;
        author = a1;
        ISBN = isbn;
    }

    public static void main(String[] args) {
       
    	 // Create an array to store books
        Book[] books = new Book[10];

        // Add books to the array
        books[0] = new Book("Chhava", "Shivaji Sawant", "9856471236");
        books[1] = new Book("Khuda", "Shivaji Sawant", "9856471237");
        books[2] = new Book("Bhagya", "Shivaji Sawant", "9856471238");

     // Display all books initially added
        for (int i = 0; i < 3; i++) {
            System.out.println("Book " + (i + 1) + ": " + books[i].title + " by " + books[i].author);
        }

        for (int i = 0; i < books.length - 1; i++) {
            if (books[i].ISBN.equals("9856471237")) {
                for (int j = i; j < books.length - 1; j++) {
                    books[j] = books[j + 1];
                }
                break;
            }
        }

        System.out.println("\nRemaining books:");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("Book " + (i + 1) + ": " + books[i].title + " by " + books[i].author);
            }
        }
    }
}

/* Dry Run
 * title= Chhava
 * author= Shivaji Sawant
 * ISBN= 9856471236
 * 
 * title= Khuda
 * author= Shivaji Sawant
 * ISBN= 9856471237
 * 
 * title= Bhagya
 * author= Shivaji Sawant
 * ISBN= 9856471238
 * 
 * Book 1: Chhava by Shivaji Sawant
 * Book 2: Khuda by Shivaji Sawant
 * Book 3: Bhagya by Shivaji Sawant
 * 
 * Remaining books:
 * Book 1: Chhava by Shivaji Sawant
 * Book 2: Bhagya by Shivaji Sawant

*/
