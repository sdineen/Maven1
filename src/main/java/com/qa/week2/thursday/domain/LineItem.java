package com.qa.week2.thursday.domain;

public class LineItem {
	private long id;
	private Product product;
	private int quantity;
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %d", product, quantity);
	}
	public LineItem(int id, Product product, int quantity) {
		setId(id);
		setProduct(product);
		setQuantity(quantity);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
