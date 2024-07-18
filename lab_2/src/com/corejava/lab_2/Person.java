//Write a Java program to create a class called "Person" with a name and age attribute. 
//Create two instances of the "Person" class, set their attributes using the constructor, 
//and print their name and age.

package com.corejava.lab_2;

public class Person {

	// Method to display the person's details
	public void display(String name, int age) 
	{
		System.out.println("Name: " +name+ ", Age: " +age);  //to print a line
	}

	public static void main(String[] args) {
		
		// Creating two instances of the Person class and setting their attributes
		Person p1 = new Person();
		Person p2 = new Person();
		
		// Displaying the details of both persons
		p1.display("Akanksha", 22);
		p2.display("Nivedita", 23);
		
	}

}

/*Dry Run
 * name: Akanksha
 * age: 22
 * Name: Akanksha, Age: 22
 
 * name: Nivedita
 * age: 23
 * Name: Nivedita, Age: 23
 */
