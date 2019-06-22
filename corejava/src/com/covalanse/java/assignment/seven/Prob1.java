package com.covalanse.java.assignment.seven;

import lombok.extern.java.Log;

@Log
public class Prob1 {
	public static void main(String[] args) {
		AddTwoNumbers result = (a, b) -> a + b;
		int i = result.add(5, 6);
		log.info(""+i);
	}

}
