package com.covalanse.java.exception;

public class IRCTC {
	void Book() {
		try{
		System.out.println("booking ticket");
		System.out.println(5/0);
		System.out.println("Booked");
	}
		catch(ArithmeticException a ) {
			System.out.println(" book method exception caught");
			
		}
		
	}
	
}
