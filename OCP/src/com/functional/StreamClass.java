package com.functional;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
	  Stream<String> empty = Stream.empty();
	  Stream<Integer> singleElement = Stream.of(0);
	  Stream<Integer> fromArray    = Stream.of(1,2,3,4,3,4,4);
	 
	  Stream<Double> randoms =Stream.generate(Math::random).limit(200);
	  System.out.println(randoms.count());
	 
	  Stream<Integer> oddNumbers = Stream.iterate(50, n->n+2)
			  						.limit(10);
	  
	  for(Object i: oddNumbers.toArray()){
		 System.out.println(i);
	  } 
	  
	  
	}

}
