package com.advanceDesign;

public class Fish extends Food{

	public Fish(int quantity) {
		super(quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void consumed() {
		System.out.println("Fish eaten: " + getQuantity());
		
	}

}
