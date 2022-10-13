package com.qa.week2.wednesday.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	

	
	

	public static void main(String[] args) {

		String s = "9";
		try {
			int j = 1 / 0;
			int i = Integer.parseInt(s); // NumberFormatException is an unchecked exception, so handling it is optional
			System.out.println(i);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}  finally {
			System.out.println("always executed");
		}

//		try {
//			Connection connection = DriverManager.getConnection("jdbc...");//SqlException is a checked exception, so handling is required
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		}

	}

}
