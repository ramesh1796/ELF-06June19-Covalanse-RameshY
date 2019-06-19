package com.covalanse.java.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestR {
	public static void main(String[] args) {
		LinkedList<Double> ll=new LinkedList<Double>();
		ll.add(9.2);
		ll.add(1.5);
		ll.add(6.9);
		ll.add(2.4);
		ll.add(3.6);
		System.out.println("For loop");
		for(int i=0;i<ll.size();i++){
			Double l=ll.get(i);
			System.out.println(l);
		}
		System.out.println("For Each loop");
			for(Double o:ll) {
				System.out.println(o);
			}
			System.out.println("Ite");
			Iterator<Double> it=ll.iterator();
			while(it.hasNext()) {
				Double o=it.next();
				System.out.println(o);
			}
			System.out.println("listIte.");
			ListIterator<Double> lit=ll.listIterator();
			while(lit.hasNext()) {
				Double oo=lit.next();
				System.out.println(oo);
			}
		
	}
}
