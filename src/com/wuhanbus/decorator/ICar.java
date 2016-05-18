package com.wuhanbus.decorator;


public interface ICar {
	void move();
}

class Car implements ICar{
	@Override
	public void move() {
		System.out.println("陆地上跑！");
	}
}

class SuperCar implements ICar{
	private ICar car;
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	@Override
	public void move() {
		car.move();
	}
}

class FlyCar extends SuperCar{
	public FlyCar(ICar car) {
		super(car);
	}
	public void fly(){
		System.out.println("天上飞!");
	}
	@Override
	public void move() {
		super.move();
		fly();
	}
}

class SwimCar extends SuperCar{
	public SwimCar(ICar car) {
		super(car);
	}
	public void Swim(){
		System.out.println("水里游！");
	}
	@Override
	public void move() {
		super.move();
		Swim();
	}
}
