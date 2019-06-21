package com.covalanse.java.collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Double> v=new Vector<Double>();
		v.add(9.2);
		v.add(1.5);
		v.add(6.9);
		v.add(2.4);
		v.add(3.6);
		System.out.println("For loop");
		for(int i=0;i<v.size();i++){
			Double l=v.get(i);
			System.out.println(l);
		}
		System.out.println("For Each loop");
			for(Double o:v) {
				System.out.println(o);
			}
			System.out.println("Ite");
			Iterator<Double> it=v.iterator();
			while(it.hasNext()) {
				Double o=it.next();
				System.out.println(o);
			}
			System.out.println("listIte.");
			ListIterator<Double> lit=v.listIterator();
			while(lit.hasNext()) {
				Double oo=lit.next();
				System.out.println(oo);
			}
		
	}
	}


