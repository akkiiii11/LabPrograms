//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.

package com.corejava.lab_2;

public class Circle {

// Method to calculate and display the area and circumference of the circle
public void calAreaCircum(int r) {       //r = to store the radius of the circle
		
		int area = (int) (3.14 * r* r);
		System.out.println("Area of a Circle: " +area);
		
		int circumference = (int) (2 * 3.14 * r);
		System.out.println("Circumference of a Circle: " +circumference);
	}
	

	public static void main(String[] args) {

		// Create a Circle object with radius 5
		Circle c = new Circle();
		
		// Calculate and display the area and circumference
		c.calAreaCircum(5);

	}

}

/*Dry Run
 * r = 5
 * 3.14 * 5 * 5
 * Area of a Rectangle: 1500
 * 
 * 2 * 3.14 * 5
 * Perimeter of a Rectangle: 160
 */
