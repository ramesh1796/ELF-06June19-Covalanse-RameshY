package com.covalanse.java.examples;

public class TestArraycc {
	public static void main(String[] args) {
		int a[]= {5,6,2,1,4};
		int[] b= {30,40,50,60,70,80};
		int gi=1;
		int gn=2;
		int si=3;
		int k=0;
		int count=0;
		/*
		 * for(int i=gi;i<b.length;i++) {
		 * 
		 * }
		 */
		System.arraycopy(a, 2, b, 2, 2);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}


}
