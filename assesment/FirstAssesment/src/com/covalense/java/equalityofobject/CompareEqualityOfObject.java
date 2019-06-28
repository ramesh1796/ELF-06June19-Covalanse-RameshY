package com.covalense.java.equalityofobject;

import java.util.ArrayList;

/*
 * WAP to compare the equality of two objects.

 */
public class CompareEqualityOfObject {

	 
	
	public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<Student>();
	Student s1=new Student(11,"Kumar");
	Student s2=new Student(22,"Kishor");
	Student s4=new Student(11,"Kumar");
	Student s3=new Student(33,"Mohit");
	Student s5=new Student(33,"Mohit");
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	

}
}