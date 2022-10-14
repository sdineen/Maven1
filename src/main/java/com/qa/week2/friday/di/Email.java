package com.qa.week2.friday.di;

public class Email implements Notifier{

	public String generateWeatherAlert(String conditions) {
	       String alert = "It is " + conditions;
	        return alert;
	}

	@Override
	public void alertWeatherConditions(String conditions) {
        if (conditions.equals("sunny")) {
            System.out.println("It is sunny");
        }	
	}

}
