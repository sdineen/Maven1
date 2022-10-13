package com.qa.week2.wednesday.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCustomerRepository implements CustomerRepository {

	private String jdbcUrl = "";
	private String username = "";
	private String password = "";

	public JdbcCustomerRepository(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public JdbcCustomerRepository(String jdbcUrl, String username, String password) {
		this.jdbcUrl = jdbcUrl;
		this.username = username;
		this.password = password;
	}

	// CREATE TABLE Customer (ID INT PRIMARY KEY, FIRSTNAME VARCHAR(255), SURNAME
	// VARCHAR(255));
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(jdbcUrl, username, password);
	}

	@Override
	public void createCustomer(Customer customer) throws SQLException {
		Connection connection = getConnection();
		// get a statement
		Statement statement = connection.createStatement();
//		String sql = "insert into Customer (id,firstName, surname) values ("
//		+customer.getId()+",'"+customer.getFirstname()+"','"+customer.getSurname()+"')";

		String sql = String.format("insert into Customer (id,firstName, surname) values (%d,'%s','%s')",
				customer.getId(), customer.getFirstname(), customer.getSurname());

		statement.executeUpdate(sql);

	}

	@Override
	public Customer read(int id) throws SQLException {
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM Customer where id = " + id;
		ResultSet resultSet = statement.executeQuery(sql);
		Customer customer;
		if (resultSet.next()) {
			customer = new Customer(resultSet.getInt("id"), resultSet.getString("firstName"),
					resultSet.getString("surname"));
			return customer;
		}
		return null;
	}

	/**
	 * Update an existing Customer
	 * 
	 * @param customer to be updated
	 * @throws SQLException
	 */
	@Override
	public void update(Customer customer) throws SQLException {
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		String sql = String.format("update customer set firstname ='%s', surname='%s' where id=%d",
				customer.getFirstname(), customer.getSurname(), customer.getId());
		statement.executeUpdate(sql);
	}

	@Override
	public void delete(int id) throws SQLException {
		Connection connection = null;
		try {
		    connection = DriverManager.getConnection(jdbcUrl, username, password);
			Statement statement = connection.createStatement();
			String sql = "delete from Customer where id = " + id;
			statement.executeUpdate(sql);
		} finally {
			connection.close();
		}
	}
	
	public void deleteTryWithResources(int id) throws DataAccessException {
		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);) {		    
			Statement statement = connection.createStatement();
			String sql = "deletezzz from Customer where id = " + id;
			statement.executeUpdate(sql);
		} 
		catch(SQLException e) {
			throw new DataAccessException("unable to delete customer "+id, e);
		}
		
	}
	
	

}
