package com.covalense.java.simpleint;

import lombok.extern.java.Log;

/*
 * WAP to calculate simple interest using lambda expression
 */
@Log
public class CalculateSI {
	public static void main(String[] args) {
		SimpleInterest si = (a, r, t) -> {
			return (a * r * t) / 100;
		};
		double result = si.calculateSI(20000.80, 24, 3);
		log.info("Simple interest is:-  " + result);
	}
}
