//Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.

//package declaration
package lab_5;

//abstract class Vehicle declaration
abstract class Vehicle
{
	// abstract method to start the engine
	abstract void startEngine();
	
	// abstract method to stop the engine
	abstract void stopEngine();
}

//class Car declaration, which extends Vehicle
class Car extends Vehicle
{

	// overriding the startEngine method to describe starting a car engine
	@Override
	void startEngine() {
		
		// printing the message "Car engine Start."
		System.out.println("Car engine Start.");
		
	}

	// overriding the stopEngine method to describe stopping a car engine
	@Override
	void stopEngine() {

		// printing the message "Car engine Stop."
		System.out.println("Car engine Stop.");
		
	}
	
}

//class Motorcycle declaration, which extends Vehicle
class Motorcycle extends Vehicle
{

	// overriding the startEngine method to describe starting a motorcycle engine
	@Override
	void startEngine() {
		
		// printing the message "Motorcycle engine Start."
		System.out.println("Motorcycle engine Start.");
		
	}

	// overriding the stopEngine method to describe stopping a motorcycle engine
	@Override
	void stopEngine() {
		
		// printing the message "Motorcycle engine Stop."
		System.out.println("Motorcycle engine Stop.");
		
	}
	
}

public class VehicleMain {

	public static void main(String[] args) {
		
		// creating an object of Car class
		Car c = new Car();
		
		// calling the startEngine method on the Car object
		c.startEngine();
		
		// calling the stopEngine method on the Car object
		c.stopEngine();
		
		
		// creating an object of Motorcycle class
		Motorcycle m = new Motorcycle();
		
		// calling the startEngine method on the Motorcycle object
		m.startEngine();
		
		// calling the stopEngine method on the Motorcycle object
		m.stopEngine();

	}

}

/* Dry Run
 * 
 * Car engine Start.
 * Car engine Stop.
 * Motorcycle engine Start.
 * Motorcycle engine Stop.
 * 
*/

