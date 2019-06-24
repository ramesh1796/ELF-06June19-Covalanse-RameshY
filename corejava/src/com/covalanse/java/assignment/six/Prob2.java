package com.covalanse.java.assignment.six;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class Prob2 {
public static void main(String[] args) {
	ArrayList<StudentBean> al= new ArrayList<StudentBean>();
	StudentBean sb1=new StudentBean();
	sb1.setRoll(111);
	sb1.setName("Bob");
	StudentBean sb2=new StudentBean();
	sb2.setRoll(222);
	sb2.setName("Rob");
	StudentBean sb3 =new StudentBean();
	sb3.setRoll(333);
	sb3.setName("Raman");
	StudentBean sb4= new StudentBean();
	sb4.setRoll(444);
	sb4.setName("Monika");
	StudentBean sb5= new StudentBean();
	sb5.setRoll(555);
	sb5.setName("Radhika");
    al.add(sb1);
    al.add(sb2);
    al.add(sb3);
    al.add(sb4);
    al.add(sb5);
    for(int i=0;i<al.size();i++) {
    	StudentBean s=al.get(i);
    	log.info(""+s.getRoll());
    	log.info(""+s.getName());
    }
			
}
}
