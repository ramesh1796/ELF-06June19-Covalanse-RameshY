package com.covalanse.java.lambdafunction;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class PredicateExample {
public static void main(String[] args) {
	Predicate<Integer> p=a->a%2==0;
	boolean x=p.test(16);
	log.info(""+x);
}
}
