package com.covalanse.java.lambdaexp;
interface Factorial{
	int fact(int a);
}
public class TestB {
public static void main(String[] args) {
	Factorial f=a->{
		int k=1;
		for(int i=1;i<=a;i++) {
			k=k*i;
		}
		return k;
	};
	int res=f.fact(5);
	System.out.println(res);
}
}
