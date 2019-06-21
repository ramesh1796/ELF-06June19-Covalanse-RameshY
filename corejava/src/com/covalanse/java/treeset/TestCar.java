package com.covalanse.java.treeset;

import java.util.TreeSet;

public class TestCar {
public static void main(String[] args) {
	TreeSet<Car> p=new TreeSet<Car>();
	Car p1=new Car();
	p1.name="BMW";
	p1.cost=2000000;
	p1.rating=4.5;
	Car p2=new Car();
	p2.name="Hundai";
	p2.cost=200;
	p2.rating=4.5;
	Car p3=new Car();
	p3.name="Audi";
	p3.cost=40;
	p3.rating=5.2;
	Car p4=new Car();
	p4.name="Lamborgini";
	p4.cost=30000000;
	p4.rating=5.0;
	p.add(p1);
	p.add(p2);
	p.add(p3);
	p.add(p4);
	for(Car d:p) {
		System.out.println("Car is "+d.name);
		System.out.println("Cost is "+d.cost);
		System.out.println("Rating "+d.rating);
	}
}
}
