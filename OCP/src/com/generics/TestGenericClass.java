package com.generics;

public class TestGenericClass {

	public static void main(String[] args) {
	    
		//Test these values
		Integer num   = new Integer(1);
        Float   fnum = new Float(4.2222F); 
  
        //Test these values
        int    primInt = 23;
        double primDouble=243.343;
        
        SizeLimitedCreate genericClass = new SizeLimitedCreate(num,fnum);
        genericClass.printValue();
        
        SizeLimitedCreate genericClass2 = new SizeLimitedCreate(primInt,primDouble);
        genericClass2.printValue();
        
	}

}
