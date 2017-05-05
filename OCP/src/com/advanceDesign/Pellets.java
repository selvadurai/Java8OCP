package com.advanceDesign;

public class Pellets extends Food {

	public Pellets(int quantity) {
		super(quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void consumed() {
		System.out.println("Hay pellet: " + getQuantity());
		
	}

}
