package com.covalanse.java.lambdafunction;

public class TestAvg {
public static void main(String[] args) {
	MyStudent my=new MyStudent();
	Average a= my :: avg;
	a.avg(10, 12, 16);
}
}
