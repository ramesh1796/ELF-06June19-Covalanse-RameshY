package com.covalanse.java.inheritance;

//multilevel inheritance
public class Animal {
	public static void main(String[] args) {
		Cat w=new Cat();
		w.eat();
		w.walk();
		w.run();
	}

	void eat() {
		System.out.println("parent member");
	}
}
class Lion extends Animal{
	void run() {
		System.out.println(" child member lion class");
	}
}
class Cat extends Lion{
	void walk() {
		System.out.println("cat class member");
	}
}