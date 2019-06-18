package com.covalanse.java.examples;

public class TestObj {
	public static void main(String[] args) {

		Pen a=new Pen();
	 a.cost=20;
	 a.name="cam";
	 a.write();
	 System.out.println("cost is"+a.cost);
	 System.out.println("Name is"+a.name);
	}

}
 class Pen{
	String name;
	int cost;
	void write() {
		System.out.println("I am write method");
	}
}
