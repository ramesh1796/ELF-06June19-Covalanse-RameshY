package com.covalanse.java.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abc");
		al.add("Bcd");
		al.add("Def");
		al.add("Efg");
		al.add("Hij");
		al.add("Klm");
//	ListIterator<String> lit=al.listIterator();
//	while(lit.hasNext()) {
//		String s=lit.next();
//		System.out.println(s);
//	}
		for (String a : al) {
			System.out.println(a);
		}
	}
}
