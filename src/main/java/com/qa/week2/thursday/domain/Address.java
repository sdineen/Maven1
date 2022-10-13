package com.qa.week2.thursday.domain;

public class Address {
	private long id;
	private String street;
	private String city;
	private String postcode;
	
	public Address(int id, String street, String city, String postcode) {
		setId(id);
		setStreet(street);
		setCity(city);
		setPostcode(postcode);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d %s %s %s", id, street, city, postcode);
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
}
