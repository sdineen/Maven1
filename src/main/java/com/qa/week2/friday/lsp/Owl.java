package com.qa.week2.friday.lsp;

public class Owl extends FlyingBird {

	private int altitude;
	@Override
	public void fly() {
		altitude+=1000;

	}
	int getAltitude() {
		return altitude;
	}
	void setAltitude(int altitude) {
		this.altitude = altitude;
	}

}
