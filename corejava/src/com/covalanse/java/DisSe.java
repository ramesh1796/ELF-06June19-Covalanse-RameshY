package com.covalanse.java;

import lombok.extern.java.Log;

@Log
public class DisSe {
	
public static void main(String[] args) {
	int age=60;
	int dis=10;
	int amount=500;
	if(age>=60)
	{
	 double result=amount-amount*dis/100;
	 log.info("Please pay this amount  "+result);
	}
}
}
