package com.covalanse.java.assignment.six;

import java.util.ArrayList;


import lombok.extern.java.Log;
@Log
public class Prob3 {
public static void main(String[] args) {
	ArrayList<ProductBean> al=new ArrayList<ProductBean>();
	ProductBean pd1= new ProductBean();
	pd1.setPid(1111);
	pd1.setName("abc.com");
	pd1.setCost(123.11);
	ProductBean pd2= new ProductBean();
	pd2.setPid(2222);
	pd2.setCost(1999.0);
	pd2.setName("bbc.in");
	ProductBean pd3= new ProductBean();
	pd3.setPid(3333);
	pd3.setName("ssc.in");
	pd3.setCost(2100.0);
	ProductBean pd4= new ProductBean();
	pd4.setCost(2001);
	pd4.setName("ccna.co.in");
	pd4.setPid(1212);
	ProductBean pd5= new ProductBean();
	pd5.setCost(3400.0);
    pd5.setPid(5555);
	pd5.setName("sitalfoundataion.com");
	al.add(pd1);
	al.add(pd2);
	al.add(pd3);
	al.add(pd4);
	al.add(pd5);
	
	for(int i=0;i<al.size();i++) {
		ProductBean pro= al.get(i);
		if(pro.getCost()<2000) {
			log.info("Name "+pro.getName());
			log.info("Cost "+pro.getCost());
			log.info("Pid "+pro.getPid());
		}
	}
	
}
}
