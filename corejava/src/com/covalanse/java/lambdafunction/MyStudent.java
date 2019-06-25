package com.covalanse.java.lambdafunction;

import lombok.extern.java.Log;

@Log
public class MyStudent {
	void avg(int a,int b,int c) {
		double ag=(a+b+c)/3.0;
		log.info("Average"+ag);
	}
int myFact(int k){
		int f=1;
		for(int i=1;i<=k;i++) {
			f=f*i;
		}
		return f;
	}
}
