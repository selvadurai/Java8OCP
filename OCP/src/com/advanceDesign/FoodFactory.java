package com.advanceDesign;

public class FoodFactory {

  public static Food getFood(String animalName) {
	  switch(animalName){
	    case "Fish" :return new Fish(20);
	    case "Hay": return new Hay(74);
	    case "Pellets": return new Pellets(40);
	  }
	  
	  return null;
  }


}
