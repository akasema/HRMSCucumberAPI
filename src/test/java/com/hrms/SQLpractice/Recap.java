package com.hrms.SQLpractice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Test;


public class Recap {
	String dbUrl="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	
	@Test
	public void gettingConnected() throws SQLException {
		// important part: connection, statement, result
		Connection con=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		// DataBase MetaData  db name 
		DatabaseMetaData dbMetaData=con.getMetaData();
		String dbName=dbMetaData.getDatabaseProductName();
		System.out.println("dbName ="+dbName);
		// Start Querry 
		Statement st =con.createStatement();
		ResultSet rset=st.executeQuery("select * from ohrm_skill");
		
		//Start MetaData
		ResultSetMetaData rsetMetaData=rset.getMetaData();
		int cols=rsetMetaData.getColumnCount();
		System.out.println(cols);
		String colName;
		//Get information(column Name) from DB
		for (int i=1; i<=cols; i++) {
			colName=rsetMetaData.getColumnName(i);
			System.out.println("Column name= "+colName);
			
		}
		
		String id;
		String skill;
		while(rset.next()) {
			id=rset.getObject("id").toString();
			skill=rset.getObject("name").toString();
			System.out.println(id+"="+skill);
		}
		rset.close();con.close();st.close();
	
	}

}