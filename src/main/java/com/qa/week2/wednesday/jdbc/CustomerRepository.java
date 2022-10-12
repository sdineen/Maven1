package com.qa.week2.wednesday.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerRepository {

	private String jdbcUrl = "";
	private String username = "";
	private String password = "";
	

	public CustomerRepository(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public CustomerRepository(String jdbcUrl, String username, String password) {
		this.jdbcUrl = jdbcUrl;
		this.username = username;
		this.password = password;
	}




	//CREATE TABLE Customer (ID INT PRIMARY KEY,   FIRSTNAME VARCHAR(255), SURNAME VARCHAR(255));
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(jdbcUrl, username, password);
	}

	public void createCustomer(Customer customer1) {
		//get a connection
		//get a statement
		

		
		
	}

}
