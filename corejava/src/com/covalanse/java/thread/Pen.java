package com.covalanse.java.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	@Override
public void run() {
	for(int i=0;i<5;i++) {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info(" "+i);
	}
	String s=getName();
	log.info(s);
	
}
}
