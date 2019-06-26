package com.covalanse.java.assignment.one;

public class pattern10 {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			if(i==2 && j<5 || j==2 && i<5) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
}
}
