package com.wuhanbus.decorator;

public class client {
	public static void main(String[] args) {
		ICar car = new Car();
		car.move();
		System.out.println("#######################");
		FlyCar car2 = new FlyCar(new Car());
		car2.move();
		System.out.println("#######################");
		SwimCar car3 = new SwimCar(new FlyCar(new Car()));
		car3.move();
	}
}
