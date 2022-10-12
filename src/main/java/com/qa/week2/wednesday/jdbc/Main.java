package com.qa.week2.wednesday.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		//CustomerRepository repository = new CustomerRepository("jdbc:h2:~/db1");
		CustomerRepository repository = new CustomerRepository(
				"jdbc:mysql://localhost:3306/ecommerce",
				"root","carpond");
//		Connection connection = repository.getConnection();
//		System.out.println(connection.getMetaData().getDatabaseProductName());
		
//		Customer customer1 = new Customer(2, "Jane", "Smith");
//		repository.createCustomer(customer1);
		
//		Customer customer = repository.read(1);
//		System.out.println(customer);
		
		Customer customer1 = new Customer(2, "Juliet", "Smith");
		repository.update(customer1);
		
		

	}

}

