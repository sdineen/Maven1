package com.qa.week2.friday.solid;

public class Car {
    private String colour;
    private String model;
    private int mileage;
    private double tyreTread = 5.0;
    

	// constructor
    public Car(String colour, String model, int mileage) {
        this.colour = colour;
        this.model = model;
        this.mileage = mileage;
    }


	public int getMileage() {
		return mileage;
	}


	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


	double getTyreTread() {
		return tyreTread;
	}


	void setTyreTread(double tyreTread) {
		this.tyreTread = tyreTread;
	}



}