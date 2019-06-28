package com.covalense.java.countobject;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal {
	void eatGrass() {
		log.info("Cow class method");
	}
}
