package com.covalanse.java;

import lombok.extern.java.Log;

@Log
public class LargerThree {
	public static void main(String[] args) {
		int a = 17;
		int b = 1121;
		int c = 10;

		if (a > b && a > c)
			log.info(a + " ");

		else if (b > c)
			log.info(b + " ");

		else {

			log.info(c + " ");

		}

	}
}
