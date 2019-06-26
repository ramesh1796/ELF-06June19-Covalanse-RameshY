package com.covalanse.java.implenum;

import lombok.extern.java.Log;

@Log
public class TestE {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			int c= 3/0;	
		} catch (ArithmeticException | NullPointerException e) {
			log.info(""+e.getMessage());
		} 
		catch (Exception e) {
			log.info("I am General block");
		}
	}
}
