package com.design;


/*@author kevin
 *
 *1. They do not need access specifier
 *2. They cannot be declared static and cannot declare static fields or methods
 *3. They have access to all fields and methods of the enclosing class
 *4. They do not have access to local variables of a method unless those variables are final or effically final 
 *
 *
 */

public class LocalInnerClass {
    
	 private int length =50;
	 
	 public void calculate(){
	     final int width=20;
		  
		  class Inner{
			  public void multiply(){
				 System.out.println(length*width);  
			  }
		  }
		 
	     Inner inner = new Inner();
	     inner.multiply();
		  
	 }
	
	
	
    public static void main(String[] args) {
    	 LocalInnerClass outer = new  LocalInnerClass();
    	 outer.calculate();
	   
	
    }

}
