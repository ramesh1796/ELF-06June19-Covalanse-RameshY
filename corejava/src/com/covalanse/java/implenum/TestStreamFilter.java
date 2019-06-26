package com.covalanse.java.implenum;


import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

import java.util.ArrayList;
@Log
public class TestStreamFilter {
public static void main(String[] args) {
	ArrayList<Integer> al= new ArrayList<Integer>();
	al.add(5);
	al.add(6);
	al.add(4);
	al.add(3);
	al.add(2);
     List<Integer> x=al.stream().filter(i->i%2!=0).collect(Collectors.toList());
     log.info(""+x);
}
}
