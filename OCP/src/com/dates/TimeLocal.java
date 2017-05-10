package com.dates;

import java.time.LocalDate;
import java.time.Month;


public class TimeLocal {

  public static void main(String [] args){
	  LocalDate date1 = LocalDate.of(2017,Month.FEBRUARY,9);
	  LocalDate date2 = LocalDate.of(2017,02,9);
	  
	  Month month = Month.JANUARY;
	  boolean b2 = month ==Month.APRIL;
	  System.out.println(b2);
	  
	  
  }
	

}
