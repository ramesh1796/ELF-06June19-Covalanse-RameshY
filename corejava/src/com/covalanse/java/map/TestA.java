package com.covalanse.java.map;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.java.Log;

@Log
public class TestA {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("one", 1);
		hm.put("tow", 2);
		hm.put("Three", 3);
		hm.put("Four", 4);
		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();
			log.info("key is " + key);
			log.info("Value is " + value);

		}

	}
}
