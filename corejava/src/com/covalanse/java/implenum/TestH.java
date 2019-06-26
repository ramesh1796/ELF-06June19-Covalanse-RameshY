package com.covalanse.java.implenum;

import java.util.ArrayList;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class TestH {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);
		Predicate<Integer> y = i -> i % 2 != 0;
		long x = al.stream().filter(y).count();
		log.info("Number of object" + x);
	}

}
