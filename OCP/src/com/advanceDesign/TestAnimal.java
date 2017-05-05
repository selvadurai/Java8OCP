package com.advanceDesign;

public class TestAnimal {

	public static void main(String[] args) {
		AnimalBuilder animalBuilder = new AnimalBuilder();
		animalBuilder
		.setAge(30)
		.setSpecies("Rabbit");
		
		AnimalModel rabbit = animalBuilder.build();
		System.out.println(rabbit.getSpecies() +" "+ rabbit.getAge());

	}

}
