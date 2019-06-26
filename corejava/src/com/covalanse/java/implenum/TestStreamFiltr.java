package com.covalanse.java.implenum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class TestStreamFiltr {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> al= new ArrayList<Integer>();
	al.add(5);
	al.add(6);
	al.add(4);
	al.add(3);
	al.add(2);
	Predicate<Integer> y=i->i%3==0;
     List<Integer> x=al.stream().filter(y).collect(Collectors.toList());
     log.info(""+x);
}
}