package com.covalanse.java.stream;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;
@Log
public class TestStudent {
  static Comparator<Student> c=(i,j)->{
		if(i.getPer()>j.getPer()) {
			return 1;
		}
		else if(i.getPer()<j.getPer()) {
			return -1;
		}
		else {
			return 0;
		}
		
	};
public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<Student>();
	Student s1= new Student(111, 82.8);
	Student s2= new Student(112, 80.8);
	Student s3= new Student(113, 91.8);
	Student s4= new Student(114, 65.8);
	Student s5= new Student(115, 87.8);
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	Student s=getTopper(al);
	log.info("Roll:-  "+s.getId()+"  Percentage:-  "+s.getPer());
	Student p=getPapper(al);
	log.info("Roll:-  "+p.getId()+"  Percentage:-  "+p.getPer());
	
}
 static Student getTopper(ArrayList<Student> al) {
	
	
	return (al.stream().max(c).get());
}
 static Student getPapper(ArrayList<Student> al) {
		
		
		return (al.stream().min(c).get());
	}
}
