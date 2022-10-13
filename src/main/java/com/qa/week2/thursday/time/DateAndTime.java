package com.qa.week2.thursday.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTime {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2022, 10, 13);
		System.out.println(localDate);
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		ZonedDateTime zonedTime1 = ZonedDateTime.of(today, ZoneId.of("Europe/London"));
		System.out.printf("%tc",zonedTime1);

	}

}
