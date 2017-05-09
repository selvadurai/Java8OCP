package com.generics;

public class ShipableRobotTest {

	public static void main(String[] args) {
		ShippableRobotCreate ship = new ShippableRobotCreate();
		RobotModel robot = new RobotModel(12,"UnixRobot");
	    ship.ship(robot);

	}

}
