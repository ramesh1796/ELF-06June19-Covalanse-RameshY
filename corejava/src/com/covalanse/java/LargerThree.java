package com.covalanse.java;

public class LargerThree {
	public static void main(String[] args) {
		int a=17,b=1121,c=10;
		/*
		 * if(a>=b && b>=c || a>=c && c>=b) { System.out.println(a+" is larger number");
		 * } else if(b>=a && a>=c || b>=c && c>=a ) {
		 * System.out.println(b+" is larger number"); } else if(c>=b && b>=a || c>=a &&
		 * a>=b) System.out.println(c+" is larger number");
		 */
		
		if(a>b && a>c)
			System.out.println(a+" ");
			
		else if(b>c)
			System.out.println(b+" ");
			
		else {
	
			System.out.println(c+" ");
	
		}
		
		
		
	}
}
