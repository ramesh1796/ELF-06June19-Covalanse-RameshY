package com.covalanse.java.implenum;

import lombok.extern.java.Log;

@Log
public class TestSwitch {
public static void main(String[] args) {
	String s ="Apple";
	switch (s) {
	case "Apple":log.info("Hi its Apple");
		
		break;
	case "Cat":log.info("Hi its Cat");
	
	break;

	default:log.info("Hi its Other");
		break;
	}
}
}
