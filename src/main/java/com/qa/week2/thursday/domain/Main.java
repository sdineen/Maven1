package com.qa.week2.thursday.domain;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("bean bag");
		product1.setCostPrice(17);
		product1.setRetailPrice(26);
		
		Product product2 = new Product(2, "Dog food", 0.57, 1.65);
		
		
		ArrayList<Product> products = new ArrayList<>();
		System.out.println(products.size());
		System.out.println(products.isEmpty());
		
		products.add(product1);
		products.add(product2);
		Product p1 = products.get(0);
		System.out.println(p1);

	}

}
