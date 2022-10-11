package com.qa.week2.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TemperatureConverterTest {
	
	
	private static TemperatureConverter temperatureConverter;

	@BeforeClass
	public static void init() {
		temperatureConverter = new TemperatureConverter();
	}

	@Test
	public void testConvertFahrenheitToCelsius() {
		float actual = temperatureConverter.convertFahrenheitToCelsius(100);
		assertEquals(37.77, actual, 0.01);
	}



}
