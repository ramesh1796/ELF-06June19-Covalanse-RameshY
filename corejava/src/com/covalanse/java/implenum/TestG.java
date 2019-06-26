package com.covalanse.java.implenum;

import java.util.List;
import java.util.ArrayList;

import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class TestG {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(5);
	al.add(6);
	al.add(4);
	al.add(3);
	al.add(2);
	//Predicate<Integer> y = i -> i % 2 != 0;
	List<Integer> s=al.stream().sorted().collect(Collectors.toList());
	
	log.info("Collection is sorted" +s);
}
}
