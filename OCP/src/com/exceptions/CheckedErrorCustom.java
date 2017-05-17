package com.exceptions;

public class CheckedErrorCustom extends Exception {

	public CheckedErrorCustom(){
		super();
	}
	
    public CheckedErrorCustom(Exception e){
    	super(e);
    }	
    
    public CheckedErrorCustom(String message){
    	super(message);
    }
	
}
