package com.qa.week2.friday.di;

public class Main {

	public static void main(String[] args) {
		WeatherTracker tracker = new WeatherTracker();
		tracker.notify(new SMS());

	}

}
