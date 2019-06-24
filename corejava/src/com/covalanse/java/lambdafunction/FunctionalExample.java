package com.covalanse.java.lambdafunction;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class FunctionalExample {
public static void main(String[] args) {
	Function<Double,Double> f=r->3.142*r*r;
	double x=f.apply(5.5);
	log.info(""+x);
}
}
