package com.covalanse.java.lambdafunction;

import lombok.extern.java.Log;

@Log
public class Pen {
	Pen(){
		log.info("Zero Para. constructor");
	}
Pen write() {
	return new Pen();
	
}
}
