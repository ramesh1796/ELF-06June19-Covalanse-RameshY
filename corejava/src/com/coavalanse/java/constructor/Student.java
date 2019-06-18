package com.coavalanse.java.constructor;

public class Student {
String name;
int age;
double percentage;
Student(String name, int age, double percentage){
	// this is use for assign local value to the global variable
	//this.name show global variable and name showed local variable
	
	this.name=name;
	this.age=age;
	this.percentage=percentage;
}
void display() {
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
	System.out.println("Percentage is "+percentage);
}
}
