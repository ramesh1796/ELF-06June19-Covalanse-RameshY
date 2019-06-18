package com.covalanse.java;

public class ResultGrade {

	public static double percentage(int a, int b) {
		double k= (a/b)*100;
		return k;
	}
	public static void main(String[] args) {
		int value1=560, value2 =600;
		double y=percentage(value1, value2);
         System.out.println(y);		
	}
}

