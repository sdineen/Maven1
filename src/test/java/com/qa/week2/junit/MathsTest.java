package com.qa.week2.junit;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MathsTest {

	@Test
	public void testDivide() {
		double result = Maths.divide(10.0,3.0);
		double expected = 10.0/3.0;
		assertTrue(result == expected);
	}
	
	@Test
	public void testFactorial5() {
		double actual = Maths.factorial(5);
		double expected = 120;
		assertEquals(expected, actual, 1e-6);
	}
	@Test
	public void testFactorial6() {
		double actual = Maths.factorial(6);
		double expected = 720;
		assertEquals(expected, actual, 1e-6);
	}

}
