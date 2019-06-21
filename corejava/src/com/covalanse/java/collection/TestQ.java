package com.covalanse.java.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestQ {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(45);
		ll.add("tara");
		ll.add('A');
		ll.add(7.9);
		for(int i=0;i<ll.size();i++){
			Object l=ll.get(i);
			System.out.println(l);
			for(Object o:ll) {
				System.out.println(o);
			}
			Iterator it=ll.iterator();
			while(it.hasNext()) {
				Object o=it.next();
				System.out.println(o);
			}
			ListIterator lit=ll.listIterator();
			while(lit.hasNext()) {
				Object oo=lit.next();
				System.out.println(oo);
			}
	}
}
}
