package com.dates;

import java.util.Locale;
import java.util.ResourceBundle;

public class Geo {

	public static void main(String[] args) {
		Locale us     = new Locale("en","US");
		Locale france = new Locale("fr","FR"); 
		printProperties(us);
		printProperties(france);

	}
	
	public static void printProperties(Locale locale){
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
	    System.out.println(rb.getString("hello"));
	    System.out.println(rb.getString("open"));
	}

}
