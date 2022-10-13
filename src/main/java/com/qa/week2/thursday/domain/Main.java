package com.qa.week2.thursday.domain;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<>();

		VeblenGood veblen1 = new VeblenGood(1, "Krug champagne", 40);
		VeblenGood veblen2 = new VeblenGood(2, "Rolex watch", 400);
		NormalGood normal1 = new NormalGood(3, "Ford Focus", 9000);
		NormalGood normal2 = new NormalGood(4, "Sardine can", 0.5);
		
		products.add(veblen1);
		products.add(veblen2);
		products.add(normal1);
		products.add(normal2);
		
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
