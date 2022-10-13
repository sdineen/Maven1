package com.qa.week2.thursday.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NormalGoodTest {
	@Test
	public void retailPrice2TimesCostPrice() {
		NormalGood normalGood = new NormalGood(4, "Lidl champagne", 5);
		assertEquals(10, normalGood.getRetailPrice(), 1e-9);
	}

}
