package com.generics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHash {

	public static void main(String[] args) {
	   Set<Integer> set = new HashSet<>();
	   set.add(10);
	   set.add(50);
	   set.add(100);
	   set.add(100);

	   for(Integer integer:set){
		   System.out.println(integer.intValue() );
	   }
	   
	   System.out.println(set.contains(10));
	   
	   PersonModel p1= new PersonModel (123,"Chun sa",58);
	  
	   Set<PersonModel> setPerson  = new HashSet<>();
	   setPerson.add(p1);
	   System.out.println(setPerson.contains(p1));	
	
	}

}
