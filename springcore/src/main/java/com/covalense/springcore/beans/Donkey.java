package com.covalense.springcore.beans;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal {
	@Override
	public void eat() {
     	log.info("Eating Grass.......");	
	}

	@Override
	public void makeSound() {
		log.info("Donkey sound.......");
		
	}

}
