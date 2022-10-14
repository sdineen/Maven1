package com.qa.week2.friday.interfacesegregation.exercise;

public class Falcon implements EggLayingCreature, FlyingCreature {

	private int altitude;
	private int eggCount;

	@Override
	public void fly() {
		altitude++;	
	}

	@Override
	public void layEggs() {
		eggCount++;
	}

}
