//Create table in database using JDBC For Employee table

package com.lab_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeJDBCCreateTable {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish a connection to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");
        
        // Create a prepared statement to execute the SQL query
        PreparedStatement ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS Employee (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), age INT, gender VARCHAR(50), dept VARCHAR(50))");
        
        // Execute the SQL query to create the table
        int result = ps.executeUpdate();
        
        // Check if the table was created successfully
        if (result == 0) 
        {
            System.out.println("Employee Table is Created...!!!");
        } 
        else 
        {
            System.out.println("Employee Table already exists...!!!");
        }
        
        // Close the connection
        con.close();
    }

}

/*Dry Run

Employee Table is Created...!!!

*/