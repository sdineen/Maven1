package com.qa.week2.wednesday.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerRepository {

	public Connection getConnection() throws SQLException {
		String jdbcUrl = "jdbc:h2:~/db1";
		return DriverManager.getConnection(jdbcUrl);
	}

}
