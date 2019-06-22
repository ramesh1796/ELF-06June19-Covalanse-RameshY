package com.covalanse.java;

import lombok.extern.java.Log;

@Log
public class OddEven {
	public static void main(String[] args) {
		int num=10;
		if(num%2==0) 
			log.info("Number is Even");

		else
			log.info("number is odd");
	}
}
