package com.functional;


import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.models.Person;


public class FunctionLamada {

	public static void main(String[] args) {
		
		ArrayList<Integer> array =new ArrayList<Integer>();
		
		//Load Array List with values 
		Consumer<ArrayList<Integer>> loadArray = x->{
			for(int i=0;i<1_000_000;i++)
			   x.add( (int)(Math.random() * 1_000_000) + 0 );    
		};
		
		//Sort Array
		
		Function<ArrayList<Integer>,ArrayList<Integer>>sortArray =x->{
		      return x.stream()
			 .filter(y -> y < 25)
			 .limit(100)
			 .collect(Collectors.toCollection(ArrayList::new) );
		};


		//Count 
		Consumer<ArrayList<Integer>>count =x->{
		 	Long t =x.stream()
			.filter(y->y==8)
			.count();
			
		 	System.out.println("The numbers of "+t);
		};
		
		
		//Create Data into array
		loadArray.accept(array);
		
		//Sort Array
		ArrayList<Integer> sort=sortArray.apply(array);
	
		//Count
		count.accept(array);
		
	}

}
