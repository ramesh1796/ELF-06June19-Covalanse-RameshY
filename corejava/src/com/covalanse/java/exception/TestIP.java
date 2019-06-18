package com.covalanse.java.exception;

public class TestIP {
	public static void main(String[] args) {
		PayTm p=new PayTm();
		try {
		p.pay();
		}
		catch(ArithmeticException a) {
			System.out.println("pay method exception caught");
			
		}
		IRCTC i=new IRCTC();
		i.Book();
	}

}
