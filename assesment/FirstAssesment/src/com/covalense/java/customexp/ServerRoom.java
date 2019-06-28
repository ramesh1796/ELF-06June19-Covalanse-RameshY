package com.covalense.java.customexp;

import lombok.extern.java.Log;

@Log
public class ServerRoom {
	void CheckTemp(double temp )  {
		if(temp>18) {
			log.info("Temp is high");
		}
		else {
			log.info("Temp is good");
		}
	}

}
