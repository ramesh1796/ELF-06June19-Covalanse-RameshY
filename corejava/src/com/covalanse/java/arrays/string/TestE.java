package com.covalanse.java.arrays.string;

public class TestE {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	char c[]= {'a','b', 'c','d'};
	for(int i=0;i<a.length;i++) {    
		System.out.print(a[i]+" ");
	}
	for(int i=c.length-1;i>=0;i--) {
		System.out.print(c[i]);
	}
}
}
