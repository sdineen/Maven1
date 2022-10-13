package com.qa.week2.thursday.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VeblenGoodTest {
	
	@Test
	public void retailPrice5TimesCostPrice() {
		VeblenGood veblen1 = new VeblenGood(3, "Krug champagne", 40);
		assertEquals(200, veblen1.getRetailPrice(), 1e-9);
	}
}
