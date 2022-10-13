package com.qa.week2.thursday.domain;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private long id;
	private LocalDate orderDate;
	private List<LineItem> lineItems;
	private Customer customer;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%tF %s %s", orderDate, lineItems, customer);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public List<LineItem> getLineItems() {
		return lineItems;
	}
	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
