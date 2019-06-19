package com.covalanse.java.collection;

import java.util.ArrayList;

public class TestG {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(15.0);
		al.add(9.8);
		al.add(5.8);
		al.add(3.3);
		al.add(44.44);
		for (double r : al) {
			System.out.println(r);
		}
	}
}
