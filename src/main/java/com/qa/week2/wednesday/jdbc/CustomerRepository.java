package com.qa.week2.wednesday.jdbc;

import java.sql.SQLException;

public interface CustomerRepository {

	void createCustomer(Customer customer) throws SQLException;

	Customer read(int id) throws SQLException;

	void update(Customer customer) throws SQLException;

	void delete(int id) throws SQLException;

}