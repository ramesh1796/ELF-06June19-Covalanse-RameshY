package com.covalanse.java.exception;

public class TestA {
	public static void main(String[] args) {
		
		String s=null;
	try {
		System.out.println(20/0);
		System.out.println(s.length());
		
	}
	catch(ArithmeticException a) {
		System.out.println("ArithmeticException caught");
		
	}
	catch(NullPointerException n) {
		System.out.println("Null pointer Exception caught");
		
	}
	}

}
