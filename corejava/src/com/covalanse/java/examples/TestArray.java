package com.covalanse.java.examples;

public class TestArray {
public static void main(String[] args) {
	int a[]= {5,6,2,1,4};
	int[] b= {30,40,50,60,70,80};
	int gi=2,k=0;
	for(int i=gi;i<b.length;i++) {
		 {
			b[i]=a[k++];
		}
		
		
		
	}
	
	for(int j=0;j<b.length;j++) {
		System.out.print(b[j]+" ");
	}
}
}
