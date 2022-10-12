package com.qa.week2.wednesday.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

	public void createCustomer(Customer customer) throws SQLException {
		Connection connection = getConnection();
		//get a statement
		Statement statement = connection.createStatement();
//		String sql = "insert into Customer (id,firstName, surname) values ("
//		+customer.getId()+",'"+customer.getFirstname()+"','"+customer.getSurname()+"')";
		
		String sql = String.format("insert into Customer (id,firstName, surname) values (%d,'%s','%s')",
		customer.getId(),customer.getFirstname(),customer.getSurname());
		
		statement.executeUpdate(sql );

		
	}

	public Customer read(int id) throws SQLException {
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM Customer where id = "+id;
		ResultSet resultSet = statement.executeQuery(sql );
		Customer customer;
		if(resultSet.next()) {
			customer = new Customer(
					resultSet.getInt("id"),
					resultSet.getString("firstName"),
					resultSet.getString("surname"));
			return customer;
		}
		return null;
	}

	/**
	 * Update an existing Customer
	 * @param customer to be updated
	 * @throws SQLException
	 */
	public void update(Customer customer) throws SQLException {
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);		
	}
	

}
