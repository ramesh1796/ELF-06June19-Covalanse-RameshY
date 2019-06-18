package com.covalanse.java.multiinterface;

public class Test {
	public static void main(String[] args) {
		Browser b=new Browser();
	Gmail m=new Gmail();
	GDrive d=new GDrive();
	b.open(d);
	}

}
