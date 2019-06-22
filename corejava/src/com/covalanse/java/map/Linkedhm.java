package com.covalanse.java.map;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.extern.java.Log;

@Log
public class Linkedhm {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> tm = new LinkedHashMap<String, Integer>();
		tm.put("one", 11);
		tm.put("tow", 22);
		tm.put("Three", 33);
		tm.put("Four", 44);
		for (Map.Entry<String, Integer> t : tm.entrySet()) {
			String key = t.getKey();
			Integer value = t.getValue();
			log.info("key is " + key);
			log.info("Value is " + value);
			log.info("***********");

		}
	}

}
