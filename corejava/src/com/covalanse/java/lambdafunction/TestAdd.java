package com.covalanse.java.lambdafunction;

import lombok.extern.java.Log;
@Log
public class TestAdd {
	
public static void main(String[] args) {
	Addnum s=Demo ::sum;
	int i=s.sum(10,30);
	log.info(""+i);
}
}
