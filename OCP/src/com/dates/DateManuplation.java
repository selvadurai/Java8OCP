package com.dates;

import java.time.LocalDate;
import java.time.Month;

public class DateManuplation {

	public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017,Month.MAY,10);
        date=date.plusWeeks(4).plusDays(2);
        
        System.out.println("I will be writing my OCP exam on : " + date);
  
	}

}
