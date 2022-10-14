package com.qa.week2.friday.di;


/**
 * @author Owner
 * @version 1.0
 * @created 14-Oct-2022 14:51:17
 */
public class SMS implements Notifier {

	public void alertWeatherConditions(String weatherConditions){
		System.out.println("SMS "+weatherConditions);
	}

}