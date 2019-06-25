package com.covalanse.java.lambdafunction;

import lombok.extern.java.Log;

@Log
public class TestJ {
public static void main(String[] args) {
	MyStudent my =new MyStudent();
	Factorial ff=my::myFact;
	int i=ff.getfact(5);
	log.info(""+i);

}
}
