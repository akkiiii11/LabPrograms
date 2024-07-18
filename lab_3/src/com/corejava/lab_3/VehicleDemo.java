//Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

package com.corejava.lab_3;		//package declare

class Vehicle		//class declare
{
	public void drive()		//vehicle class method
	{
		System.out.println("Repairing a Vehicle");		//print the line as output
	}
}

class Car extends Vehicle				//car class access all the properties, methods of vehicle	
{
		public void drive()				// car class method
		{
			System.out.println("Repairing a Car");			// to print a line
		}
}

public class VehicleDemo {			//main class

	public static void main(String[] args) {
	
		Vehicle v = new Vehicle();		//creating a new object of vehicle using new keyword
		Car c = new Car();				//creating a new object of car using new keyword
		
		v.drive();				//calling a method
		c.drive();				//calling a method
	
	}

}

/*Dry Run
 * 
 * calling a vehicle method
 * Repairing a Vehicle
 * 
 * calling a car method
 * Repairing a Car
 */
