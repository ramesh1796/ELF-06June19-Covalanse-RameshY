package com.covalanse.java.exception;

public class Validator {
	int age;
	void check( int age) {
		if(age>18) {
			System.out.println("allow");
		}
		else
		{
			throw new UnderAgeException("Sorry you are too young to enter the pub");
			//System.out.println("not allow");
		}
	}

}
