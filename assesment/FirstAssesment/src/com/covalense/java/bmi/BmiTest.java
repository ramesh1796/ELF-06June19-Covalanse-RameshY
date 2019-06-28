package com.covalense.java.bmi;

import lombok.extern.java.Log;

/*
 * WAP to calculate the BMI and print the BMI with result
 */
@Log
public class BmiTest {
	public static void main(String[] args) {

		CaclculateBmi c = (h, w) -> w / h * h;

		double result = c.calBmi(5, 280);
		if (result > 24) {
			log.info("Over Weight " + result);
		} else if (result > 18.4) {
			log.info("Normal Weight " + result);
		} else {
			log.info("Under Weight " + result);
		}
	}

}
