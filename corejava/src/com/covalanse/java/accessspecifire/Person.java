package com.covalanse.java.accessspecifire;

import lombok.extern.java.Log;

@Log
public class Person {
	
		
	
	Mobile m= new Mobile();
	int i=6;
	void walk() {
		log.info("ok");
	}
	public static void main(String[] args) {
	Person p=new Person();
	p.m.call();

}
}