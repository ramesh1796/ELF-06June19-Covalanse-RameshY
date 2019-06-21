package com.covalanse.java.map;

import java.util.Map;
import java.util.TreeMap;

public class TestB {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm=new TreeMap<String, Integer>();
		tm.put("one",11);
		tm.put("tow",22);
		tm.put("Three",33);
		tm.put("Four",44);
		for(Map.Entry<String, Integer> t:tm.entrySet()) {
			String key=t.getKey();
			Integer value=t.getValue();
			System.out.println("key is "+key);
			System.out.println("Value is "+value);
			System.out.println("***********");

		}
	}

}
