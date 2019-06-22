package com.covalanse.java.assignment.seven;

import lombok.extern.java.Log;

@Log
public class Prob4 {
	public static void main(String[] args) {
		Square sq = a -> a * a;
		int result = sq.squareofnum(6);
		log.info(""+result);
	}

	
}
