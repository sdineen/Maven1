package com.qa.week2.wednesday.jdbc;

public class Customer {

	private int id;
	private String firstname;
	private String surname;

	public Customer(int id, String firstname, String surname) {
		this.setId(id);
		this.setFirstname(firstname);
		this.setSurname(surname);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
