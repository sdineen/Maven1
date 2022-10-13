package com.qa.week2.thursday.domain;

public class Customer {

	//attributes
	private long id;
	private String name;
	private Address address;
	
	public Customer(int id, String name, Address address) {
		setId(id);
		setName(name);
		setAddress(address);
	}
	
	//operations or behaviour (methods)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d %s %s", id, name, address);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
