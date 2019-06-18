package com.covalanse.java.inheritance;

public class Inheritance {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add();
	}
void calC() {
	System.out.println("scientific calculator");
}
}
class Calculator extends Inheritance{
	void add() {
		System.out.println("add");
	}
	void sub() {
		System.out.println("sub");
	}
}
