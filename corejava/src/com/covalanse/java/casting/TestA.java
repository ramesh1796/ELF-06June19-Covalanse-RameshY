package com.covalanse.java.casting;

public class TestA {
	public static void main(String[] args) {
		Animal a= new Cow();
		a.eat();
		a.i=9;
		Cow c=(Cow)a;
		c.x=10;
		c.run();
		
	}

}
