package com.qa.week2.wednesday.withoutoptional;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		// TODO Auto-generated method stub
		Soundcard soundcard = computer.getSoundcard();
		if(soundcard != null) {
			soundcard.getUSB();		
		}
	}

}
