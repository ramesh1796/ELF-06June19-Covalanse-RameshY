package com.covalanse.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(5);
		hs.add(2.6);
		hs.add('A');
		hs.add("Priya");
		for (Object r : hs) {
			System.out.println(r);
		}
		System.out.println("Using Ite");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
