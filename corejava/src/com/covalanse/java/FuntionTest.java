package com.covalanse.java;

import lombok.extern.java.Log;

@Log
public class FuntionTest {
	public static int theju(int a, int b) {
		return a + b;
	}

	public static int multi(int a, int b) {

		return a * b;
	}

	public static int factorial(int a) {
		int f = 1;
		for (int i = 1; i <= a; i++) {
			f = f * i;

		}
		return f;
	}

	static int fact(int x) {
		if (x == 0) {
			return 1;
		}
		return x * fact(x - 1);
	}

	public static double bmi(int h, int w) {

		return w / h * h;
	}

	public static void main(String[] args) {

		int w = 90;
		int h = 6;
		double res = bmi(h, w);
		if (res > 25) {
			log.info("Over weight");
		} else if (res > 18.5) {
			log.info("Normal weight");
		} else if (18.5 > res) {
			log.info("under weight");
		}
	}

}
