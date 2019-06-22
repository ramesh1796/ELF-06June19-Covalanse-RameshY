package com.covalanse.java.collection;

import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Logger;

public class TestS {
	private static final Logger log = Logger.getLogger("Main Method class");
	public static void main(String[] args) {
		
		Vector<Double> al=new Vector<Double>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);
		
		Enumeration<Double> d=al.elements();
		while(d.hasMoreElements()) {
			double k=d.nextElement();
			log.info("k");
		}
	}
}
