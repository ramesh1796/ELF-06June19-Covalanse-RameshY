package com.covalanse.java.lambdafunction;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class PredicateExample3 {
public static void main(String[] args) {
	int b[]= {2,5,9,6,4,3};
	Predicate<Integer> k=a->a%2==0;
	for(int i=0;i<b.length;i++) {
		if(k.test(b[i]))
		 {
			log.info(""+b[i]);
		}
		
		
	}
}
}
