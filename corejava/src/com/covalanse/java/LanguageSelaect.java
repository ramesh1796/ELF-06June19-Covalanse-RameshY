package com.covalanse.java;

import lombok.extern.java.Log;

@Log
public class LanguageSelaect {
public static void main(String[] args) {
	int token=1;
	switch(token) {
	case 1:
		log.info("Kannda is selected");
		break;
	case 2:
		log.info("Hindi  is selected");
		break;
	case 3:
		log.info("tamil is selected");
		break;
		default:
	
			log.info("invalid");
		
	}
}
}
