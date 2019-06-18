package com.covalanse.java.overriding;

public class Animal {


	void eat() {
		System.out.println("eat");

	}

}
class Cow extends Animal{
	void eat() {
		System.out.println("cow eat");

	}
}