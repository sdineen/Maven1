package com.qa.week2.junit;

public class Maths {
	public int add(int a, int b) {
		return a + b;
	}

	public static double divide(double a, double b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	public static double factorial(int i) {
		double result = 1;
		for (; i > 1; i--) {
			result *= i;
		}
		return result;
	}



	public static int reverseFactorial(int value) {
		int i = 2;
		while (value > 1) {
			if (value % i != 0) {
				return 0;
			}
			value /= i;
			i++;
		}
		return i - 1;
	}
}
