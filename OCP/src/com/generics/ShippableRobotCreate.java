package com.generics;

public class ShippableRobotCreate implements Shippable<RobotModel> {

	@Override
	public void ship(RobotModel t) {
	    System.out.println(t.id +"  "+ t.name);
		
	}


}
