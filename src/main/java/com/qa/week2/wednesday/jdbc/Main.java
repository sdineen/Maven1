package com.qa.week2.wednesday.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		CustomerRepository repository = new CustomerRepository();
		Connection connection = repository.getConnection();
		System.out.println(connection.getMetaData().getDatabaseProductName());

	}

}
