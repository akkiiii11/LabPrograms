// Retrieve the data using JDBC for Employee

package com.lab_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class to retrieve employee data using JDBC
 */
public class EmployeeJDBCRetrieve {
    /**
     * Method to retrieve employee data
     */
    public void retrieve() throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish a connection to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");
        
        // Create a prepared statement to execute the SQL query
        PreparedStatement ps = con.prepareStatement("SELECT * FROM Employee");
        
        // Execute the prepared statement to retrieve the data
        ResultSet rs = ps.executeQuery();
        
        // Print the column names
        System.out.println("Employee Data:");
        System.out.println("ID\tName\tAge\tGender\tDepartment");
        
        // Iterate over the result set and print the employee data
        while (rs.next()) {
            // Retrieve the employee ID
            int id = rs.getInt("id");
            
            // Retrieve the employee name
            String name = rs.getString("name");
            
            // Retrieve the employee age
            int age = rs.getInt("age");
            
            // Retrieve the employee gender
            String gender = rs.getString("gender");
            
            // Retrieve the employee department
            String department = rs.getString("dept");
            
            // Print the employee data
            System.out.println(id + "\t" + name + "\t" + age + "\t" + gender + "\t" + department);
        }
        
        // Close the connection to release resources
        con.close();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Create an instance of the EmployeeJDBCRetrieve class
        EmployeeJDBCRetrieve jdbc = new EmployeeJDBCRetrieve();
        
        // Call the retrieve method to retrieve the employee data
        jdbc.retrieve();
    }
}

/*Dry Run

Employee Data:
ID	Name	Age	Gender	Department
1 Akanksha 23 Female IT

*/