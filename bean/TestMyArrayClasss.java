package com.covalanse.java.bean;

import java.util.logging.Logger;

public class TestMyArrayClasss {
	private static final Logger log = Logger.getLogger("Main Method class");

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		MyArrayClass mac = new MyArrayClass();
		int dataSize = 13;
		for (int i = 0; i < dataSize; i++) {
			mac.add("value " + i);
		}
		log.info("Removing 5th position");
		
		mac.remove(8);
		for (int i = 0; i < dataSize; i++) {
			log.info("output :-" + mac.get(i));
		}
		long end = System.currentTimeMillis();
		log.info("execution time " + (end - start));
	}// End of main
}
