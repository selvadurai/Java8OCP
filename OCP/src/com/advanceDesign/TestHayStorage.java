package com.advanceDesign;

public class TestHayStorage {

	public static void main(String[] args) {
		 HayStorage hey =HayStorage.getInstance();
         hey.addHay(1);
         System.out.println(hey.getHayQuantity());
         hey.addHay(200);
         System.out.println(hey.getHayQuantity());
         
	}

}
