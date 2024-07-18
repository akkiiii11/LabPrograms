//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

//package declare
package com.corejava.lab_3;		

//class declare
class Rectangle
{
	//intialize veriables
	int width;
	int height;
	
	//creating a constructor of class with using parameter
	Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	// assigning the values of width and height from the constructor arguments to the instance variables
	public int getArea()
	{
		// method to calculate and return the area of the rectangle
		int area = width * height;
		
		// returning the calculated area
		return area;
	}
	
}

public class ShapeDemo {

	public static void main(String[] args) {

		// creating an object of Rectangle class with width=50 and height=30
		Rectangle rect = new Rectangle(50, 30);
		
		// printing the area of the rectangle
		System.out.println("Area of a Rectangle: "+rect.getArea());
		
	}

}

/*Dry Run
 * width = 50
 * height = 30
 * area = 50 * 30
 * 
 * Area of a Recatangle: 1500
 */
