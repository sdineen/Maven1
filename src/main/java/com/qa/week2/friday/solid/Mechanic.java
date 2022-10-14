package com.qa.week2.friday.solid;

public class Mechanic {
	private Car car;
	
	public Mechanic(Car car) {
		this.car = car;
	}

	public void changeTyres() {
		car.setTyreTread(5);
	}
}
