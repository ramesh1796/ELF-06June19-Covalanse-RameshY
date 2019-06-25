package com.covalanse.java.lambdafunction;

import lombok.extern.java.Log;

@Log
public class BoyTest {
public static void main(String[] args) {
	MyBoy mb=Boy ::new;
	Boy b=mb.getBoy("Sami", 56.9, 8);
	log.info(""+b.name);
	log.info(""+b.age);
	log.info(""+b.mark);
}
}
