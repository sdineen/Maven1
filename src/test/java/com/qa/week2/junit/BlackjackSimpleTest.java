package com.qa.week2.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.week2.tuesday.junit.BlackjackSimple;

public class BlackjackSimpleTest {

	@Test
	public void testPlay1() {
		BlackjackSimple blackjack = new BlackjackSimple();
		int actual = blackjack.play(5, 8);
		assertEquals(actual, 8);
	}
	
	@Test
	public void testPlay2() {
		BlackjackSimple blackjack = new BlackjackSimple();
		int actual = blackjack.play(5, 25);
		assertEquals(actual, 5);
	}

}
