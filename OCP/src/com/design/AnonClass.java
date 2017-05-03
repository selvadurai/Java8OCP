package com.design;

public class AnonClass {
    
	 abstract class SaleTodayOnly {
		 abstract int dollarsOff();
	 }
	
	 public int admission(int basePrice){
		 SaleTodayOnly sale = new SaleTodayOnly(){
			 int dollarsOff(){return 3;}
		 };
	    return basePrice -sale.dollarsOff();
	 }
	
	public static void main(String[] args) {
		AnonClass anon = new AnonClass();
		System.out.println(anon.admission(5));
		
	}

}
