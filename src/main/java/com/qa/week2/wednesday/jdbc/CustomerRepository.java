package com.qa.week2.wednesday.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerRepository {

	String jdbcH2Url = "jdbc:h2:~/db1";
	
	String jdbcUrl = "jdbc:mysql://localhost:3306/ecommerce";
	String username = "root";
	String password = "carpond";


	//CREATE TABLE Customer (ID INT PRIMARY KEY,   FIRSTNAME VARCHAR(255), SURNAME VARCHAR(255));
	public Connection getConnection() throws SQLException {
		//String jdbcUrl = "jdbc:h2:~/db1";
		
		return DriverManager.getConnection(jdbcH2Url)
		//return DriverManager.getConnection(jdbcUrl, username, password);
	}

}
