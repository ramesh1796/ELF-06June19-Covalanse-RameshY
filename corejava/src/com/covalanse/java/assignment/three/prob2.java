package com.covalanse.java.assignment.three;

public class prob2 {
public static void main(String[] args) {
	String s="you are a student";
	String[] ss=s.split(" ");
	for(int i=0;i<ss.length;i++) {
		char[] c=ss[i].toCharArray();
	
		for(int j=c.length-1;j>=0;j--) {
			System.out.print(c[j]);
		}
		System.out.print(" ");
	}
	
}
}
