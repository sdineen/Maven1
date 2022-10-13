package com.qa.week2.thursday.domain;


public class Product  {
	//instance variables, or attributes, or fields
	private long id;	
	private String name;
	private double costPrice;
	private double retailPrice;
	
	
	public Product(long id, String name, double costPrice, double retailPrice) {
		this.id = id;
		this.name = name;
		this.costPrice = costPrice;
		this.retailPrice = retailPrice;
	}
	

	public Product() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return String.format("id: %5d name: %10s Cost price: %10.2f Retail price: %10.2f", id, name, costPrice, retailPrice);
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
	public double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(double retailPrice) {
		if(retailPrice < 0) {
			throw new IllegalArgumentException("Retail price can't be negative");
		}
		this.retailPrice = retailPrice;
	}
}
