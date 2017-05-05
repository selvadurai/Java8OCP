package com.advanceDesign;

public class TestFactory {

	public static void main(String[] args) {
	  Food	 food =FoodFactory.getFood("Fish");
      food.consumed();
      
      
	}

}