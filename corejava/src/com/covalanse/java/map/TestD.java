package com.covalanse.java.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestD {
public static void main(String[] args) {
	LinkedHashMap<Character, Double> lhm=new LinkedHashMap<Character, Double>();
	lhm.put('H',4.9);
	lhm.put('B',1.7);
	lhm.put('U',61.9);
	lhm.put('M',16.9);
	Set<Character> ts=lhm.keySet();
	for(Character s:ts) {
		System.out.println(s);
	}
	
	System.out.println("*********");
	Collection<Double> ci=lhm.values();
	Iterator<Double> it=ci.iterator();
	while(it.hasNext()) {
		Double r=it.next();
		System.out.println(r);
	}
	
}
}
