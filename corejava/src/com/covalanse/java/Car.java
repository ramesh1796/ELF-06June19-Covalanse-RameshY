package com.covalanse.java;

import lombok.extern.java.Log;

@Log
public class Car {
	public static void main(String[] args) {
		int ex=570000;
		double rto=14.26;
		double ii=9.76;
		double r=ex*rto/100;
		double i=ex*ii/100;
		double result= ex+r+i;
		log.info(""+result);
	}

}
