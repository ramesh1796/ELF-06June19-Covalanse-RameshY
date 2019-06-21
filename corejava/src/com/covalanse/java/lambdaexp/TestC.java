package com.covalanse.java.lambdaexp;
interface Square{
	int sqt(int a);
}
public class TestC {
public static void main(String[] args) {
	Square s=a->a*a;
	System.out.println(s.sqt(9));
}
}
