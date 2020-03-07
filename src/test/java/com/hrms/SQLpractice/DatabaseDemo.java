package com.hrms.SQLpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Test;

public class DatabaseDemo {
	String dbUrl="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	 
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	@Test
	public void databaseDemo() throws SQLException{
		
		System.out.println("next line");
		//creating connection 
		Connection connection =DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		System.out.println("Connection is created");
		System.out.println(connection);
		
		//create a statement
		
		Statement statement=connection.createStatement();
	
		//execute query and store results from database in result object
		
		ResultSet resultSet=statement.executeQuery("Select* from hs_hr_employees where emp_number<3700 order by emp_number");
		
		//get values fro ressult 
		resultSet.next();
		String columnData=resultSet.getString("emp_firstname");
		System.out.println(columnData);
		
		resultSet.next();
		columnData=resultSet.getString("emp_firstname");
		System.out.println(columnData);
		
		System.out.println("---Printing values using loop--");
		
		while(resultSet.next()) {
			columnData=resultSet.getString("emp_firstname");
			System.out.println(columnData);
					
		}
		
		// close all db connection
		resultSet.close();
		statement.close();
		connection.close();
		
				
	}

}
