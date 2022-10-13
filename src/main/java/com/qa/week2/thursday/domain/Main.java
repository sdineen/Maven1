package com.qa.week2.thursday.domain;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("bean bag");
		product1.setCostPrice(17);
		product1.setRetailPrice(26);
		
		Product product2 = new Product(2, "Dog food", 0.57, 1.65);
		
		System.out.println(product1);
		System.out.println(product2);

	}

}
