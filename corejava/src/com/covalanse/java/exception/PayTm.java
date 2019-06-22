package com.covalanse.java.exception;

import lombok.extern.java.Log;

@Log
public class PayTm {
	void pay() {
		log.info("payment is in process");
		log.info(""+6/0);
		log.info("payment success");
		
	}

}
