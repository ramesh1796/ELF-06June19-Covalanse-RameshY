package com.covalanse.java.lambdaexp;
interface Sum{
	int add(int a,int b);
}
public class TestA {
  
	public static void main(String[] args) {
		Sum s=(a,b)->a+b;
		int i=s.add(5, 6);
		System.out.println(i);
	}
}
