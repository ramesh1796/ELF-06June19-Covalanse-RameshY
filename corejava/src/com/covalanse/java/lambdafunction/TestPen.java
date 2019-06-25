package com.covalanse.java.lambdafunction;

public class TestPen {
public static void main(String[] args) {
	Pen pf =new Pen(); 
	PenFactrory p= pf :: write ;
	p.getPen();
		
	
}
}
