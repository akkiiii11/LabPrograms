// Insert the record into Employee table using JDBC

package com.lab_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeJDBCInsert {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish a connection to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");
        
        // Create a prepared statement to execute the SQL query
        PreparedStatement ps = con.prepareStatement("insert into Employee values(?,?,?,?,?)");	// to insert a data
        
        // Declare variables to store user input
        int id;
        String name, age, gender, dept;
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);	// give a input from user
        
        // Prompt the user to enter employee details
        System.out.println("Insert the Employee Details...");
        
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
        System.out.println("Enter the Employee dept Name: ");
        dept = sc.next();
        
        // Set the prepared statement parameters with user input
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, age);
        ps.setString(4, gender);
        ps.setString(5, dept);
        
        // Execute the prepared statement to insert the data
        int i = ps.executeUpdate();		// executeUpdate return a int.
        
        // Print the result of the insertion
        System.out.println(i + " Employee Data is Added Successfully...");
        
        // Close the connection to release resources
        con.close();
    }

}

/*Dry Run

Insert the Employee Details...
Enter the Employee ID: 
1
Enter the Employee Name: 
Akanksha
Enter the Employee Age: 
23
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

 */
