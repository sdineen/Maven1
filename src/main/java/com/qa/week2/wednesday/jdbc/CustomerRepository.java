package com.qa.week2.wednesday.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerRepository {

	//CREATE TABLE Customer (ID INT PRIMARY KEY,   FIRSTNAME VARCHAR(255), SURNAME VARCHAR(255));
	public Connection getConnection() throws SQLException {
		String jdbcUrl = "";
		return DriverManager.getConnection(jdbcUrl);
	}

}
