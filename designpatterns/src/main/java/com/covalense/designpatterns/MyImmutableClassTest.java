package com.covalense.designpatterns;

import com.covalense.designpatterns.builder.MyImmutableClass;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
public static void main(String[] args) {
	MyImmutableClass immutableClass= new MyImmutableClass("ABC", 16, 98778847455L);
	log.info("name "+immutableClass.getName());
	log.info("Age "+immutableClass.getAge());
	log.info("Phone "+immutableClass.getPhone());
	
	immutableClass= new MyImmutableClass("XYZ", 36, 8778847455L);
	log.info("name "+immutableClass.getName());
	log.info("Age "+immutableClass.getAge());
	log.info("Phone "+immutableClass.getPhone());
}//end main
}//end class
