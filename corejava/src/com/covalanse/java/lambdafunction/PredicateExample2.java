package com.covalanse.java.lambdafunction;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class PredicateExample2 {
public static void main(String[] args) {
	Predicate<String> p=a->a.length()>=5;
	boolean x=p.test("Hiiiiiiiiiii");
	log.info(""+x);
}
}
