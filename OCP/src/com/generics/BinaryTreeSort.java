package com.generics;

import java.util.Set;
import java.util.TreeSet;

public class BinaryTreeSort {
	//(int id,String name, int age)
  
  public static void main(String[] args) {	
	    
   
	  TreeSet<Integer> set = new TreeSet<Integer>();
      set.add(1);
      set.add(300);
      set.add(790);
      set.add(50);
      System.out.println(set.contains(1));
      int x=set.ceiling(1);
      System.out.println(x);
       
      
  }
   
}
