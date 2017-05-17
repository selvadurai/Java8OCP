package com.exceptions;

public class AutoTry implements AutoCloseable{

	public static void main(String[] args) {
	  try(AutoTry auto = new AutoTry()){
		  System.out.println("Inside Try statement");
	  } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	@Override
	public void close() throws Exception {
		System.out.println("System is closing by itself");
		
	}

}
