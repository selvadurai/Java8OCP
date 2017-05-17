package com.exceptions;

import java.sql.SQLException;

public class MultiCatch {

	public static void main(String[] args) { 

	  try{
		 int x=1/0; 
	  }catch(ArrayIndexOutOfBoundsException |ArithmeticException e){
		  e.printStackTrace();
	  }catch(Exception e){
		  e.printStackTrace();
	  }
	
	  
	  System.out.println("Still here");
	  
	  
	}

}
