package com.functional;

import java.util.ArrayList;
import java.util.function.Consumer;
import com.models.Person;


public class ConsumeLamada {

	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println("Hello " + x);
		c1.accept("Hello World");
		c2.accept("Chuchay");
		
		Consumer<Person> c3 =x -> System.out.println(x.getName() +" "+x.getAge());
		c3.accept(new Person("Bob",24));
		
		System.out.println("****************************************************");
		
		ArrayList<Integer> c4 =new ArrayList<Integer>();
		//Load Array List with values 
		Consumer<ArrayList<Integer>> loadArray = x->{
			for(int i=0;i<1_000_000;i++)
			   x.add( (int)(Math.random() * 1_000_000) + 0 );    
		};
		
	    loadArray.accept(c4);
		System.out.println("array size " + c4.size() +" Get array[index] "+ c4.get(450));
		

	}

}
