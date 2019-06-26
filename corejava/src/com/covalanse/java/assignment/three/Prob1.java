package com.covalanse.java.assignment.three;

public class Prob1 {
public static void main(String[] args) {
	String s= "Hi hw are you nishan";
	String[] s1=s.split(" ");
	int l=s1.length;
	for(int i=0;i<l;i++) {
		System.out.print(s1[i]+(s1[i].length())+" ");
	}
}
}
