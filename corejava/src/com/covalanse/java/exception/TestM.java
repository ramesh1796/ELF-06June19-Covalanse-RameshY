package com.covalanse.java.exception;

public class TestM {
	 public static void main(String[] args) {
		 System.out.println("main start");
		 Validator v=new Validator();
		 
		 try {
			v.check(9);
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}
		 
		 
		System.out.println("main ended");
	}

}
