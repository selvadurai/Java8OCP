package com.functional;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionClass {
	
	
	public static Optional<Double> average(int...scores){
      int sum =0;
      
      if(scores.length==0) return Optional.empty();
      
      for(int score: scores)sum +=score;
	   
      return Optional.of((double) sum/scores.length);
      
	}

	public static void main(String[] args) {
	  
	    Optional<Double> opt= OptionClass.average(90,70,50,80,32);
	    opt.ifPresent(System.out::println);
	    opt.orElse(0.0);
   }

}
