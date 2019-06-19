package com.covalanse.java.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestC {
	public static void main(String[] args) {
		TreeSet<Integer> hs=new TreeSet<Integer>();
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
