package com.qa.week2.friday.lsp;

public class Penguin extends FlightlessBird {

	private int speed;
	
	@Override
	public void flap() {
		speed=+5;

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
