package com.design;

/*--------Member Inner Class Rules-----------------------------------------------
 *1. Can be declared public, private, or protected, or use the default access
 *2. Can be extend any class and implement interface
 *3. Can be abstract or final 
 *4. Cannot declare static fields or methods  
 *5. Can access members of the outer class including private members.  
 *-------------------------------------------------------------------------------- */


public class OuterClass {
   private String greeting = "Hi";
   
   protected class Inner{
	   public int repeat =3;
	   
	    public void go(){
	    	for(int i=0;i< repeat; i++){
	    		System.out.println(greeting);
	    	}
	     }
    }

   public void callInner(){
	   Inner inner = new Inner();
	   inner.go();
   }
   
   public static void main(String[] args){
	  OuterClass outer = new OuterClass();
	  outer.callInner();
   }
   

}
