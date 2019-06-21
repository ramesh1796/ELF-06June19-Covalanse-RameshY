package com.covalanse.java.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class TesTE {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(15);
	al.add(9.8);
	al.add('a');
	al.add("Divya");
	al.add(44.44);
	ListIterator lit=al.listIterator(al.size());
	while(lit.hasPrevious()) {
		Object r=lit.previous();
		System.out.println(r);
	}
}
}
