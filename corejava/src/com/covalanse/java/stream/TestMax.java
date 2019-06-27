package com.covalanse.java.stream;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;
@Log
public class TestMax {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);
		
		Comparator<Integer> c=(i,j)->i.compareTo(j);
		Integer maxValue=al.stream().max(c).get();
		log.info(""+maxValue);
	}
}
