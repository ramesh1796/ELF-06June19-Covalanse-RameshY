package com.covalanse.java.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log

public class TestOf {
	//Integer a[]= {5,7,4,1,2};
public static void main(String[] args) {
	
	Stream<Integer> s= Stream.of(9,5,7,4,1,2);
	s.forEach(i->log.info(""+i));
}
}
