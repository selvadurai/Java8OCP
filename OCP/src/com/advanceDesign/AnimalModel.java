package com.advanceDesign;

public class AnimalModel {
   private String species;
   private int     age;
   
   public AnimalModel(String species,int age){
	   this.species=species;
	   this.age=age;
   }
   
   public String getSpecies(){
	   return species;
   }
   
   public int getAge(){
	   return age;
   }
   
}
