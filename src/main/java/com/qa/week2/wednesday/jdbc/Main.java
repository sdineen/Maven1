package com.qa.week2.wednesday.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args)  {
		//CustomerRepository repository = new CustomerRepository("jdbc:h2:~/db1");
		
		
		JdbcCustomerRepository repository = new JdbcCustomerRepository(
				"jdbc:mysql://localhost:3306/ecommerce",
				"root","carpond");
		
		try {
			repository.deleteTryWithResources(2);
		} catch (DataAccessException e) {
			System.out.println(e.getMessage());
		}
		
		
		
//		Connection connection = repository.getConnection();
//		System.out.println(connection.getMetaData().getDatabaseProductName());
//		
//		Customer customer1 = new Customer(2, "Jane", "Smith");
//		repository.createCustomer(customer1);
		
		
		
		

	}

}

