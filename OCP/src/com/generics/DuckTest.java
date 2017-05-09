package com.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DuckTest {

	public static void main(String[] args) {
	   List<Duck> list = new ArrayList<>();
	   list.add(new Duck("a",50));
	   list.add(new Duck("b",323)); 
	   list.add(new Duck("d",5)); 
	   list.add(new Duck("e",42)); 
	   list.add(new Duck("f",100));
	   Collections.sort(list);
	   System.out.println(list);
	   
	   Comparator<Duck> byWeight =(d1,d2) ->d1.getWeight()- d2.getWeight();
	   Collections.sort(list,byWeight);
	   System.out.println(list);
	   
	   
	   
	 
	
	}

}
