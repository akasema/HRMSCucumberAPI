package com.hrms.SQLpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.junit.Test;

public class JdbcDemo2 {
	
	String dbUrl="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";

	@Test
	public void JDBCDemo() throws SQLException {
		
		// Connect Database retrieve names and store in ArrayList and print them 
		
		Connection connection= DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		System.out.println(connection);
		System.out.println("Connection is created");
		
		Statement statement=connection.createStatement();
		ResultSet reSet=statement.executeQuery("Select* from ohrm_nationality order by name");
		String cData;
		ArrayList<String>arrData=new ArrayList<>();
		while(reSet.next()) {
			arrData.add(reSet.getString("name"));
							
		}
		
		for(String data:arrData) {
			System.out.println(data);
		}
		
		// close all db connection
		reSet.close();
		statement.close();
		connection.close();
		
		
	}
	
	
}
