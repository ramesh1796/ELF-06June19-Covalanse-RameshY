package com.covalanse.java.assignment.three;

public class Prob3 {
	public static void main(String[] args) {
		String s="How r You doing";
		String[] s1= s.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(i%2==0) {
				char[] c=s1[i].toCharArray();
				for(int j=c.length-1;j>=0;j--) {
					System.out.print(c[j]);
				}
			}
			else {
				System.out.print(" "+s1[i]+" ");
			}
		}
	}

}
