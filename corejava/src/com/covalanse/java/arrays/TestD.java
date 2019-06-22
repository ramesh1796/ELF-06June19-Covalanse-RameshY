package com.covalanse.java.arrays;

import lombok.extern.java.Log;

@Log
public class TestD {
	public static void main(String[] args) {
		Integer[] num = { 5, 2, 1, 4, 3 };
		int[] n = { 5, 2, 1, 4, 3 };
		String[] s = { "Sun", "moon", " zoo", "PHP" };
		double[] d = { 2.3, 5.3, 6.1, 6.3 };
		for (int r : n) {
			log.info("" + r);
		}
		for (String g : s) {
			log.info(g);
		}
		for (double p : d) {
			log.info("" + p);
		}

	} // Arrays.sort(num, Comparator.reverseOrder());

}
