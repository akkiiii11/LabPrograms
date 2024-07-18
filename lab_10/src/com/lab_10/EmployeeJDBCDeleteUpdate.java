//Delete and Update the record from Employee

package com.lab_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeJDBCDeleteUpdate {
	
	/**
	 * Method to update an employee record in the database
	 */
	public void update() throws ClassNotFoundException, SQLException
	{
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish a connection to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");
        
        // Create a prepared statement to execute the SQL query
        PreparedStatement ps = con.prepareStatement("Update Employee set name=?, age=?, gender=?, dept=? where id = ?");	// to update a data
        
        // Declare variables to store user input
        int id;
        String name, age, gender, dept;
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);	// give a input from user
        
        // Prompt the user to enter employee details to update
        System.out.println("Update Employee Details...");
        
        // Read employee ID from user
        System.out.println("Enter the Employee ID: ");
        id = sc.nextInt();
        
        // Read employee name from user
        System.out.println("Enter the Employee Name: ");
        name = sc.next();
        
        // Read employee age from user
        System.out.println("Enter the Employee Age: ");
        age = sc.next();
        
        // Read employee gender from user
        System.out.println("Enter the Employee Gender: ");
        gender = sc.next();
        
        // Read employee department from user
        System.out.println("Enter the Employee Dept Name: ");
        dept = sc.next();
        
        // Set the prepared statement parameters with user input
        // Note: the order of the parameters matters, so we set id last
        ps.setString(1, name);
        ps.setString(2, age);
        ps.setString(3, gender);
        ps.setString(4, dept);
        ps.setInt(5, id);
        
        // Execute the prepared statement to update the data
        int i = ps.executeUpdate();		// executeUpdate return a int.
        
        // Close the connection to release resources
        con.close();
        
        // Print the result of the update
        System.out.println(i + " Employee Data is Updated Successfully...");
	}
	
	/**
	 * Method to delete an employee record from the database
	 */
	public void delete() throws ClassNotFoundException, SQLException
	{
		 // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish a connection to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");
        
        // Create a prepared statement to execute the SQL query
        PreparedStatement ps = con.prepareStatement("delete from Employee where id = ?");	// to delete a data
        
        // Declare a variable to store the employee ID to delete
        int id;
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);	// give a input from user
        
        // Prompt the user to enter the employee ID to delete
        System.out.println("Delete Employee Details...");
        
        // Read the employee ID from user
        System.out.println("Enter the Employee ID: ");
        id = sc.nextInt();
        
        // Set the prepared statement parameter with the employee ID
        ps.setInt(1, id);
        
        // Execute the prepared statement to delete the data
        int i = ps.executeUpdate();		// executeUpdate return a int.
        
        // Close the connection to release resources
        con.close();
        
        // Print the result of the deletion
        System.out.println(i + " Employee Data is Deleted Successfully...");
	}
	
	/**
	 * Method to exit the program
	 */
	public void exit()
	{
		System.out.println("Please Enter Valid Input...!!!");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		EmployeeJDBCDeleteUpdate  jdbc = new EmployeeJDBCDeleteUpdate();
		
		while(true)
		{
			System.out.println("Choose any Option: 1.Update  2.Delete  3.Exit");
			int ch = sc.nextInt();
		
		
		switch(ch)
		{
			case 1: 
				jdbc.update();
				break;
				
			case 2:
				jdbc.delete();
				break;
				
			case 3:
				jdbc.exit();
				break;
				
			
			
		}
		
		}

	}

}

/*Dry Run
 
 Insert the Employee Details...
Enter the Employee ID: 
1
Enter the Employee Name: 
Akanksha
Enter the Employee Age: 
24
Enter the Employee Gender: 
Female
Enter the Employee dept Name: 
IT
1Employee Data is Added Successfully...


Insert the Employee Details...
Enter the Employee ID: 
2
Enter the Employee Name: 
Nivedita
Enter the Employee Age: 
25
Enter the Employee Gender: 
Female
Enter the Employee dept Name: 
Trainer
1 Employee Data is Added Successfully...


Choose any Option: 1.Update  2.Delete  3.Exit
1
Update Employee Details...
Enter the Employee ID: 
1
Enter the Employee Name: 
Akanksha
Enter the Employee Age: 
23
Enter the Employee Gender: 
Female
Enter the Employee Dept Name: 
IT
1 Employee Data is Updated Successfully...
Choose any Option: 1.Update  2.Delete  3.Exit


Choose any Option: 1.Update  2.Delete  3.Exit
2
Delete Employee Details...
Enter the Employee ID: 
2
1 Employee Data is Deleted Successfully...
Choose any Option: 1.Update  2.Delete  3.Exit


 
 */
