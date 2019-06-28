package com.covalense.java.countobject;

import java.util.ArrayList;

/*
 * 
 *
 * WAP to count the type of objects present in the ArrayList
 */

public class CountAnimalObject {
 public static void main(String[] args) {
	ArrayList<Animal> al= new ArrayList<Animal>();
	 Animal a1=new Cow();
	 Animal a2=new Lion();
	 Animal a3=new Dog();
	 Animal a4=new Lion();
	 Animal a5=new Cow();
	 Animal a6=new Cow();
     al.add(a1);
     al.add(a2);
     al.add(a3);
     al.add(a4);
     al.add(a5);
     al.add(a6);
     
     
	}
}
