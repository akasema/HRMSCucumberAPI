package com.hrms.SQLpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

import org.junit.Test;

public class JdbcDemo {
	
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	//jdbc:type driver:host:port/name of the database
	String dbUrl="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	
	
	@Test
	public void getDataFromDatabase() throws SQLException {
		Connection connection =DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		System.out.println("Connection is created");
		System.out.println(connection);
		
		//create a statement		
				Statement st=connection.createStatement();
				//execute query and store results from database in result object				
				ResultSet rSet=st.executeQuery("Select* from hs_hr_employees where emp_number<3700 order by emp_number");
				//get values fro result 				
				rSet.next();	
				String firstRowData=rSet.getString("name");
				System.out.println(firstRowData);
				
				// or get with this
				rSet.next();
				String SecondRowData=rSet.getObject("name").toString();
				System.out.println(SecondRowData);
				
				String data;
				while(rSet.next()) {
					data=rSet.getObject("name").toString();
					System.out.println(data);
				}
				
				rSet.close();
				st.close();
				connection.close();
				
				
				
				
				
				
				
	}
	
	
}