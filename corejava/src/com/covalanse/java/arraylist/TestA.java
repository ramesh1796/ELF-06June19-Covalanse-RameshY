package com.covalanse.java.arraylist;

import java.util.ArrayList;


import lombok.extern.java.Log;
@Log
public class TestA {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
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
		for(int i=0;i<al.size();i++) {
			Student s=al.get(i);
			log.info("name is "+s.name);
			log.info("Id is "+s.id);
			log.info("percentage "+s.percentage);
		}
		for(Student s:al) {
			log.info("name is "+s.name);
			log.info("Id is "+s.id);
			log.info("percentage "+s.percentage);
		}
		
	}

}
