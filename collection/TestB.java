package com.covalanse.java.collection;

import java.util.ArrayList;

public class TestB {
public static void main(String[] args) {
	ArrayList<Object> al=new ArrayList<Object>();
	al.add(15);
	al.add(9.8);
	al.add('a');
	al.add("Divya");
	al.add(44.44);
	for(Object r:al) {
		System.out.println(r);
	}
}
}
