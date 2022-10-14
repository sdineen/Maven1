package com.qa.week2.thursday.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.qa.week2.thursday.repository.CollectionProductRepository;
import com.qa.week2.thursday.repository.ProductRepository;

public class Main {

	public static void main(String[] args) {
		
		Address address = new Address(1, "4 Acacia Avenue", "Newcastle", "N152AR");
		Customer customer1 = new Customer(1, "John Jones", address);
	    //object reference conversion
		Product veblen1 = new VeblenGood(1, "Krug champagne", 40);
		VeblenGood veblen2 = new VeblenGood(2, "Rolex watch", 400);
		NormalGood normal1 = new NormalGood(3, "Ford Focus", 9000);
		NormalGood normal2 = new NormalGood(4, "Sardine can", 0.5);
		
		ProductRepository repository = new CollectionProductRepository();
		repository.create(veblen1);
		repository.create(veblen2);
		repository.create(normal1);
		repository.create(normal2);
		
		List<Product> products = repository.selectAll();
		
		for (Product product : products) {
			System.out.println(product);
		}

//		Order order1 = new Order();
//		order1.setId(1);
//		order1.setOrderDate(LocalDate.now());
//		List<LineItem> lineItems = new ArrayList<>();
//		lineItems.add(new LineItem(1,veblen1, 6));
//		lineItems.add(new LineItem(2,normal1, 1));
//		order1.setLineItems(lineItems);
//		order1.setCustomer(customer1);
//		System.out.println(order1);
	}

}
