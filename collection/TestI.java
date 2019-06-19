package com.covalanse.java.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestI {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(15.0);
		al.add(9.8);
		al.add(5.8);
		al.add(3.3);
		al.add(1755.0);
		al.add(44.44);
		ListIterator<Double> lit = al.listIterator();
		while (lit.hasNext()) {
			Double d = lit.next();
			System.out.println(d);
		}
	}
}
