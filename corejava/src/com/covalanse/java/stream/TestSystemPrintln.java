package com.covalanse.java.stream;

import java.util.stream.Stream;

public class TestSystemPrintln {
	public static void main(String[] args) {
		
		Stream<Integer> s= Stream.of(9,5,7,4,1,2);
		s.forEach(System.out::println);
	}
}
