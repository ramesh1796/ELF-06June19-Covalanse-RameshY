package com.covalanse.java;

public class Car {
	public static void main(String[] args) {
		int ex=570000;
		double rto=14.26, inc=9.76;
		double RTO=ex*rto/100;
		double INS=ex*inc/100;
		double ON_Road= ex+RTO+INS;
		System.out.println(ON_Road);
	}

}
