package com.dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RealTime {

	public static void main(String[] args) {
		DateTimeFormatter shortDateFormatter =
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		LocalTime date = LocalTime.now();
		
		for(;;){
		   date=LocalTime.now();
		   System.out.println(date);
		}
		
	}

}
