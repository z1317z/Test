package com.wuhanbus.test;

public class Test {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.a = 10;
		a.b = 20;
		System.out.println(a.a+" "+a.b);
		Animal b = new cat();
		b.a = 10;
		b.b = 20;
		System.out.println(a.a+" "+b.b);
		a = new cat();
		cat c = (cat)a;
		c.c = 30;
		System.out.println(b.a+" "+b.b+" "+c.c);
		
	}
}

class Animal {
	int a,b;
	
}
class cat extends Animal{
	int c;
}