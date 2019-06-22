package com.covalanse.java;

import lombok.extern.java.Log;

@Log
public class BMI {
	public static void main(String[] args) {
		int w=430,h=26;
		double bmi=w/(h*h);
		log.info(""+bmi);
		
	}

}
