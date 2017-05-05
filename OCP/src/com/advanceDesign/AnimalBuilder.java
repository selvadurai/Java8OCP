package com.advanceDesign;

import java.util.*;

public class AnimalBuilder {
  private  String species;
  private  int    age;

  
  public AnimalBuilder setAge(int age){
	  this.age=age;
	  return this;
  }
  
  public AnimalBuilder setSpecies(String species){
	  this.species=species;
	  return this;
  }
 	
  public AnimalModel build(){
	  return new AnimalModel(species,age);
  }  
	
	
}
