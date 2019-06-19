package com.covalanse.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestH {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(15.0);
		al.add(9.8);
		al.add(5.8);
		al.add(3.3);
		al.add(44.44);
		Iterator<Double> it = al.iterator();
		while (it.hasNext()) {
			Double d = it.next();
			System.out.println(d);
		}
	}
}
