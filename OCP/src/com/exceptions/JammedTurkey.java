package com.exceptions;

public class JammedTurkey implements AutoCloseable{

	@Override
	public void close() throws IllegalStateException  {
        
		try{		
		   throw new IllegalStateException("CageDoor Won't close");
	    }catch(IllegalStateException e){
		  System.out.println( e.getMessage());
	    }

    }


	public static void main(String [] args){
		try(JammedTurkey t = new JammedTurkey()){
			throw new IllegalStateException("Turkeys Ran off");
		
		}catch(IllegalStateException e){
			System.out.println("Caught: "+e.getMessage());
		
		   for(Throwable t:e.getSuppressed()){
			  System.out.println(t.getMessage()); 
		   }
		}
		
		
		
	}
	
	
}
