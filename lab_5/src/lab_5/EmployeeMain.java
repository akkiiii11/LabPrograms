//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.

// package declaration
package lab_5;

// abstract class Employee declaration
abstract class Employee
{
	// protected fields for employee name and base salary
	//Protected members are accessible within the same class and its subclasses, but not from other classes or packages.
	protected String name;
	protected double baseSalary;
	
	// constructor to initialize employee name and base salary
	// constructor is same as class name
	public Employee(String name, double baseSalary) {
	
		this.name = name;
		this.baseSalary = baseSalary;
	}

	// abstract method to calculate salary
	abstract double calculateSalary();
	
	// abstract method to display employee information
	abstract void displayInfo();
}

//class Manager declaration, which extends Employee
class Manager extends Employee
{

	// private field for manager bonus
	//Private members are only accessible within the same class, and not from any other class or package.
	private double bonus;

	// constructor to initialize manager name, base salary, and bonus
	public Manager(String name, double baseSalary, double bonus) {
		super(name, baseSalary);
		this.bonus = bonus;
	}

	// overriding the calculateSalary method to include bonus
	@Override
	double calculateSalary() {
		
		return baseSalary + bonus;
				
	}

	// overriding the displayInfo method to display manager information
	@Override
	void displayInfo() {
		
		System.out.println("Emplyee Name : Manager : " +name);
		System.out.println("Manager Base Salary : " +baseSalary);
		System.out.println("Manager Bonus : " +bonus);
		
	}
	
}

//class Programmer declaration, which extends Employee
class Programmer extends Employee
{
	// private field for programmer overtime salary
	private double overtimeSalary;

	// constructor to initialize programmer name, base salary, and overtime salary
	public Programmer(String name, double baseSalary, double overtimeSalary) {
		super(name, baseSalary);
		this.overtimeSalary = overtimeSalary;
	}

	// overriding the calculateSalary method to include overtime salary
	@Override
	double calculateSalary() {
		
		return baseSalary + overtimeSalary;
		
	}

	// overriding the displayInfo method to display programmer information
	@Override
	void displayInfo() {
		
		System.out.println("Employee Name : Programmer : " +name);
		System.out.println("Programmer Base Salary : " +baseSalary);
		System.out.println("Programmer Overtime Salary : " +overtimeSalary);
			
	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		// creating a Manager object
		Manager em = new Manager("Akanksha",40000,10000);
		
		// calling the calculateSalary method on the Manager object
		em.calculateSalary();
		
		// calling the displayInfo method on the Manager object
		em.displayInfo();
		
		// printing the total salary of the Manager
		System.out.println("Manager Total Salary : " +em.calculateSalary());
		System.out.println();
		
		// creating a Programmer object
		Programmer ep = new Programmer("Sunny",50000,20000);
		
		// calling the calculateSalary method on the Programmer object
		ep.calculateSalary();
		
		// calling the displayInfo method on the Programmer object
		ep.displayInfo();
		
		// printing the total salary of the Programmer
		System.out.println("Manager Total Salary : " +ep.calculateSalary());

	}

}

/*Dry Run
 
Emplyee Name : Manager : Akanksha
Manager Base Salary : 40000.0
Manager Bonus : 10000.0
Manager Total Salary : 50000.0

Employee Name : Programmer : Sunny
Programmer Base Salary : 50000.0
Programmer Overtime Salary : 20000.0
Manager Total Salary : 70000.0

 */
