package com.covalense.java.countobject;

import lombok.extern.java.Log;

@Log
public class Lion extends Animal {
	@Override
	void eat() {
		log.info("eat method of lion class");
	}
}
