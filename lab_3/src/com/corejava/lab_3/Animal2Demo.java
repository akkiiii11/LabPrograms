//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

// package declaration
package com.corejava.lab_3;

//class Animal2 declaration
class Animal2
{
	// method to make a sound
	public void makeSound()
	{
		// printing the message "Animal make Sounds"
		System.out.println("Animal make Sounds");
	}
}

//class Cat declaration, which extends Animal2
class Cat extends Animal2
{
	// overriding the makeSound method to describe the sound of a cat
	public void makeSound()
	{
		// printing the message "Cats Bark"
		System.out.println("Cats Bark");
	}
}

public class Animal2Demo {

	public static void main(String[] args) {
		
		// creating an object of Animal2 class
		Animal2 a = new Animal2();
		
		// calling the makeSound method on the Animal2 object
		a.makeSound();
		
		// creating an object of Cat class
		Cat c = new Cat();
		
		// calling the makeSound method on the Cat object
		c.makeSound();

	}

}

/*Dry Run
 * 
 * Animal make Sounds
 * Cats Bark
 * 
 */
