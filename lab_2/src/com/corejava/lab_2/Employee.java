//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

package com.corejava.lab_2;

public class Employee {
	
	String name;
	String jobTitle;
	double salary;
	double addSalary;

	public void emp() {
		name = "Akanksha";
		jobTitle = "Software developer";
		salary = 50000; 
		addSalary = 10000;
	}

	// Method to update the salary
	public double updateSalary() {
		
		salary = salary + addSalary;
		return salary;
//		System.out.println("Employee Updated Salary: "+updateSalary);
	}
	
	// Method to display employee details
	public void display() {
		  
		System.out.println("Employee Name: " +name+ "\nEmployee Job Title: " +jobTitle+ "\nSalary: " +salary+ "\nnew Salary: " +addSalary);
		System.out.println("Employee Updated Salary: " +updateSalary());
	}
	

	public static void main(String[] args) {
		
		// Create an Employee object
	    //new keyword used to create a class
		Employee emp1 = new Employee();
  
		emp1.emp();
		emp1.display();
		emp1.updateSalary();
	    
	}
}

/*Dry Run
 * name = "Akanksha"
 * jobTitle = "Software developer"
 * salary = 50000;
 * addSalary = 10000;
 * 
 * salary = 50000 + 10000
 * salary = 60000
 * 
 * Employee Name: Akanksha
 * Employee Job Title: Software developer
 * Salary: 50000.0
 * new Salary: 10000.0
 * Employee Updated Salary: 60000.0
 *
 */
