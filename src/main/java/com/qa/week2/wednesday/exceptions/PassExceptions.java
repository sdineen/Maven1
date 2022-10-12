package com.qa.week2.wednesday.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PassExceptions {

	public static void main(String[] args) {

		try {
			Connection connection = getConnection();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private static Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc...");

	}



}
