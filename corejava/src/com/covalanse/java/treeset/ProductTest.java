package com.covalanse.java.treeset;

import java.util.TreeSet;

public class ProductTest {
	public static void main(String[] args) {
		TreeSet<Product> p=new TreeSet<Product>();
		Product p1=new Product();
		p1.name="IceCream";
		p1.cost=20;
		p1.rating=4.5;
		Product p2=new Product();
		p2.name="Bus";
		p2.cost=200;
		p2.rating=2.5;
		Product p3=new Product();
		p3.name="Paper";
		p3.cost=40;
		p3.rating=3.5;
		Product p4=new Product();
		p4.name="Abcdk";
		p4.cost=27;
		p4.rating=3.5;
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		for(Product d:p) {
			System.out.println("name is "+d.name);
			System.out.println("Id is "+d.cost);
			System.out.println("percentage "+d.rating);
		}
	}

}
