package com.covalanse.java.wraperclass;

public class Wrap {
	public static void main(String[] args) {
		String x="50";
		String y="40";
		String z="true";
		
		int i=Integer.parseInt(x);
		int j=Integer.parseInt(y);
		boolean b=Boolean.parseBoolean(z);
		System.out.println(i+j);
		System.out.println(z);
	}

}
