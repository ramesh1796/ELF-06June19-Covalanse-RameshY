package com.covalanse.java.thread;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable {
String name;
public Mouse(String name) {
	this.name=name;
	
}
public void run() {
	log.info(""+name+" started ");
	for(int i=0;i<5;i++) {
		log.info(""+name+" printing "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
