package com.covalense.springcore.beans;

import lombok.extern.java.Log;

@Log
public class Monkey implements Animal{

	@Override
	public void eat() {
     	log.info("Eating Banana.......");	
	}

	@Override
	public void makeSound() {
		log.info("Monkey sound.......");
		
	}

}
