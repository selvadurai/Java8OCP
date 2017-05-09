package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcard{

	public static void printList(List<?> list){
		for(Object x:list) System.out.println(x);
	}
	
	
	public static void main(String[] args){
		List<String> keywords = new ArrayList<>();
		keywords.add("Java");
		keywords.add("google");
		keywords.add("oracle");
		keywords.add("IBM");
		keywords.add("Cisco");
		printList(keywords);
		
		System.out.println("    ");;
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(9);
		numbers.add(20);
		printList(numbers);
		
		
		
	}
	
	
}
