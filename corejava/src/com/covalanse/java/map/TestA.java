package com.covalanse.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestA {
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("one",1);
		hm.put("tow",2);
		hm.put("Three",3);
		hm.put("Four",4);
		for(Map.Entry<String, Integer> e:hm.entrySet()) {
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println("key is "+key);
			System.out.println("Value is "+value);

		}
		System.out.println("*****************************");
		
	}
}
