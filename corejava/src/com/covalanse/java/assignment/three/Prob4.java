package com.covalanse.java.assignment.three;

public class Prob4 {
	public static void main(String[] args) {
		String s = "Hi How Are You MsXyZ";
		String[] sa = s.split(" ");
		if (sa.length % 2 != 0) {
			String temp = sa[sa.length / 2];
			sa[sa.length / 2] = sa[0];
			sa[0] = sa[sa.length - 1];
			sa[sa.length - 1] = temp;
		}

		else {
			System.out.println("string should be odd length");
		}
          for(int i=0;i<sa.length;i++) {
        	  System.out.print(sa[i]+" ");
          }
	}
}
