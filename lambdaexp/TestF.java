package com.covalanse.java.lambdaexp;
interface StringDemo{
	int getCharCount(String st);
}
public class TestF {
public static void main(String[] args) {
	StringDemo s=a->a.length();
	int i=s.getCharCount("daviddas");
	System.out.println(i);
}
}
