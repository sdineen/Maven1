package com.qa.week2.thursday.domain;

public class NormalGood extends Product {

	public NormalGood(long id, String name, double costPrice) {
		super(id, name, costPrice, 0);
	}

	public NormalGood() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getRetailPrice() {
		// TODO Auto-generated method stub
		return getCostPrice() * 2;
	}

	
}
