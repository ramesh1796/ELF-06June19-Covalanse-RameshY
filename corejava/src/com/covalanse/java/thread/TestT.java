package com.covalanse.java.thread;

import lombok.extern.java.Log;

@Log
public class TestT {
public static void main(String[] args) {
	log.info("Main Started");
	Pen t1=new Pen();
	t1.setName("Ronak");
	t1.start();
	Pen t2=new Pen();
	t2.start();
	Pen t3=new Pen();
	t3.start();
	t2.setName("Monika");
	log.info("Main Ended");
}
}
