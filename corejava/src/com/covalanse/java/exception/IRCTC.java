package com.covalanse.java.exception;

import lombok.extern.java.Log;

@Log
public class IRCTC {
	void Book() {
		try{
		log.info("booking ticket");
		log.info(""+5/0);
		log.info("Booked");
	}
		catch(ArithmeticException a ) {
			log.info(" book method exception caught");
			
		}
		
	}
	
}
