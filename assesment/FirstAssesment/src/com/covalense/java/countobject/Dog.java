package com.covalense.java.countobject;

import lombok.extern.java.Log;

@Log
public class Dog extends Animal {
	void run() {
		log.info("Run method of dog class");
	}
}
