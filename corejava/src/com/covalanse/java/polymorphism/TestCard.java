package com.covalanse.java.polymorphism;
public class TestCard {
public static void main(String[] args) {
	Card j=new Card();
	Card a=new Card();
	j.swipe();
	a.swipe();
	j.swipe();
	j.swipe();
	j.swipe();
	a.swipe();
	System.out.println("Java count is "+j.count);
	System.out.println("Angular count is "+a.count);
	System.out.println("Organization count is "+Card.orgCount);
}
}
