package com.covalanse.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(15);
	al.add(null);
	al.add(9.8);
	al.add('a');
	al.add("Divya");
	al.add(44.4);
	Iterator it=al.iterator();
	while(it.hasNext()) {
		Object r=it.next();
		System.out.println(r);
	}
}
}
