//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

package com.corejava.lab_2;

public class Rectangle {

void calAreaPerimeter(int width, int height) {		//to initialize the width and height of the rectangle
		
		//Calculate the Area
		int area = width*height;
		System.out.println("Area of a Rectangle: " +area);
		
		//Calculate the Perimeter
		int perimeter = 2 *(width + height);
		System.out.println("Perimeter of a Rectangle: " +perimeter);
	}


	public static void main(String[] args) {
		
		// Create a Rectangle object with width 50 and height 30
		Rectangle rect = new Rectangle();
		
		// Calculate and display the area and perimeter
		rect.calAreaPerimeter(50, 30);

	}

}

/*Dry run
 * width = 50
 * height = 30
 * area = 50 * 30
 * Area of a Rectangle: 1500
 * 
 * Perimeter = 2 * (50+30)
 * Perimeter of a Rectangle: 160 
 */
