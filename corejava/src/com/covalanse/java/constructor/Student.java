package com.covalanse.java.constructor;

import lombok.extern.java.Log;

@Log
public class Student {
	String name;
	int age;
	double percentage;

	Student(String name, int age, double percentage) {
		// this is use for assign local value to the global variable
		// this.name show global variable and name showed local variable

		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}

	void display() {
		log.info("Name is " + name);
		log.info("Age is " + age);
		log.info("Percentage is " + percentage);
	}
}
