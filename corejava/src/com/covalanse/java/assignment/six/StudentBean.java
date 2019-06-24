package com.covalanse.java.assignment.six;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentBean implements Serializable {
private int roll;
private String name;
public StudentBean() {
	
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
 
}
