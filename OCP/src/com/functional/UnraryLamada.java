package com.functional;

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class UnraryLamada {

	public static void main(String [] args){
      UnaryOperator<String> u1 = x -> x.toUpperCase();
      
      System.out.println(u1.apply("lowercase"));
      
      BinaryOperator<String> monad =(string, toAdd) -> string.concat(toAdd).toUpperCase();
      
      System.out.println(monad.apply("I love ", "U.S.A"));
	  
	
	}
	
}
