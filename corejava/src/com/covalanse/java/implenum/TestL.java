package com.covalanse.java.implenum;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class TestL {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		al.stream().forEach(i -> log.info("" + i));

	}
}
