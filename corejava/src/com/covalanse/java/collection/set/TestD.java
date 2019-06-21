package com.covalanse.java.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(5);
		hs.add(2);
		hs.add(7);
		hs.add(9);
		for(Integer r:hs) {
			System.out.println(r);
		}
		System.out.println("Using Ite");
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()) {
			Integer o=it.next();
			System.out.println(o);
		}
	}

}
