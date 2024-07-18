//Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.

//package declaration
package com.corejava.lab_3;

//class Animal1 declaration
class Animal1
{
	// method to describe the movement of an animal
	public void move()
	{
		// printing the message "Animals can move"
		System.out.println("Animals can move");
	}
}

//class Cheetah declaration, which extends Animal1
class Cheetah extends Animal1
{
	// overriding the move method to describe the movement of a cheetah
	public void move()
	{
		// printing the message "Cheetahs can run"
		System.out.println("Cheetahs can run");
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		
		// creating an object of Animal1 class
		Animal1 a = new Animal1();
		
		// calling the move method on the Animal1 object
		a.move();
		
		// creating an object of Cheetah class
		Cheetah c = new Cheetah();
		
		// calling the move method on the Cheetah object
		c.move();

	}

}

/*Dry Run
 * 
 * create object animal1 and also cheetah and calling a method 
 * 
 * Animals can move
 * Cheetahs can run
 * 
 */
