package com.covalanse.java.assignment.two;

import lombok.extern.java.Log;

@Log
public class Friend {
	void receive(Gift g) {
   	 log.info("Received Gift");
   	 g.open();
    }
}
