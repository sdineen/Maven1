package com.qa.week2.thursday.domain;

import org.junit.Test;

public class ProductTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void retailPriceShouldBeAboveZero() {
		Product product = new Product();
		product.setRetailPrice(-1);
	}
}
