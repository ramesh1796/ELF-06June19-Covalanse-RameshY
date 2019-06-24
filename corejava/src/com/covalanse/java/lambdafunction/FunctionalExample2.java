package com.covalanse.java.lambdafunction;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class FunctionalExample2 {
	public static void main(String[] args) {
		Function<Integer,Integer> f=r->r*r;
		double x=f.apply(5);
		log.info(""+x);
	}
}
