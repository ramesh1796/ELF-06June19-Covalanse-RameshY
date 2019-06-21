package com.covalanse.java.treeset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TestA  {
public static void main(String[] args) {
	TreeSet<Student> al=new TreeSet<Student>();
	Student s1=new Student();
	s1.name="kavita";
	s1.id=1;
	s1.percentage=78.9;
	Student s2=new Student();
	s2.id=2;
	s2.name="shyam";
	s2.percentage=87.9;
	al.add(s1);
	al.add(s2);
	Student s3=new Student();
	s3.id=3;
	s3.name="yam";
	s3.percentage=80.9;
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	for(Student s:al) {
		System.out.println("name is "+s.name);
		System.out.println("Id is "+s.id);
		System.out.println("percentage "+s.percentage);
	}
		/*
		 * Iterator<Student> it=al.iterator(); while(it.hasNext()) { Student
		 * ss=it.next(); System.out.println(ss); }
		 */
}
}
