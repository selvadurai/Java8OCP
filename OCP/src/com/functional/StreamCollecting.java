package com.functional;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollecting {
	
	public static void main(String [] args){
	   //Mapping
	   Stream<String> ohMy = Stream.of("Lions","Lions","Tigers","Bears","Bears");
	 
	 // Map<String,Integer> map =ohMy.collect(
	   //                       Collectors.toMap(s-> s, String::length));
	 
	  //System.out.println(map);
	 
	  
	  Map<String, Long> wordCount  = ohMy.collect(
			                            	Collectors.groupingBy(
			                            			s->s,Collectors.counting()
			                            	 )
			                         );
	 
	  System.out.println(wordCount);
	 
	 
		
		
	}

}
