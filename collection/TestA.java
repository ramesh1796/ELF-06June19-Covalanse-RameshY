package com.covalanse.java.collection;

import java.util.ArrayList;

public class TestA {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(15);
	al.add(9.8);
	al.add('a');
	al.add("Divya");
	al.add(44.44);
	al.add('R');
	for(int i=0;i<al.size();i++) {
		Object r=al.get(i);
		System.out.println(r);
	}
}
}
