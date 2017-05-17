package com.exceptions;

public class TestCustomException {

	public static void main(String[] args) {
	    
		try{
		    throw new CheckedErrorCustom();
		}catch(CheckedErrorCustom e){
		   	e.printStackTrace();
		}

		/*****************************/
		try{
			throw new CheckedErrorCustom("Error has occured");
		}catch(CheckedErrorCustom e){
			e.printStackTrace();
		}
		
		
	}

}
