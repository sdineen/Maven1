package com.qa.week2.thursday.domain;

public class VeblenGood extends Product {

	public VeblenGood(long id, String name, double costPrice) {
		super(id,name,costPrice, 0);
//		setId(id);
//		setName(name);
//		setCostPrice(costPrice);
	}

	@Override
	public double getRetailPrice() {
		return getCostPrice()*5;
	}
	
	

}
