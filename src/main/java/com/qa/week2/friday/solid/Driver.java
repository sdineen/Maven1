package com.qa.week2.friday.solid;

public class Driver {

	private Car car;

	
    public Driver(Car car) {
		this.car = car;
	}

	// functionality
    public void drive(int milesDriven) {
    	car.setMileage(milesDriven + car.getMileage());
    }

}