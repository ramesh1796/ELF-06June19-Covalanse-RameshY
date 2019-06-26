package com.covalanse.java.assignment.three;

public class Student {
	private int roll;
	private String name;
	private String email;
	private char gen;
	
	public Student() {
		
	}
	public Student(int roll, String name, String email, char gen) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.gen = gen;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}

}
