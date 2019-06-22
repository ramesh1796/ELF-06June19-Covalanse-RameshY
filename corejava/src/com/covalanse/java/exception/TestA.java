package com.covalanse.java.exception;

import lombok.extern.java.Log;

@Log
public class TestA {
	public static void main(String[] args) {
		
		String s=null;
	try {
		log.info(""+20/0);
		log.info(""+s.length());
		
	}
	catch(ArithmeticException a) {
		log.info("ArithmeticException caught");
		
	}
	catch(NullPointerException n) {
		log.info("Null pointer Exception caught");
		
	}
	}

}
