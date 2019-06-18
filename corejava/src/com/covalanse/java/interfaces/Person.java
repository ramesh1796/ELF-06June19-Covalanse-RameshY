package com.covalanse.java.interfaces;

public class Person implements Animal, Human {

	public void eat() {
		System.out.println("Eat method");
	}
	public void walk() {
		System.out.println("walk method");
	}
}
