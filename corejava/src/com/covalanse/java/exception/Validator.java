package com.covalanse.java.exception;

import lombok.extern.java.Log;

@Log
public class Validator {
	int age;
	void check( int age) {
		if(age>18) {
			log.info("allow");
		}
		else
		{
			throw new UnderAgeException("Sorry you are too young to enter the pub");
			//log.info("not allow");
		}
	}

}
