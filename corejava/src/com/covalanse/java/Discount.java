package com.covalanse.java;

public class Discount {
	public static void main(String[] args) {
		int amount=100;
		double discount=15.2;
		int firstTime=1;
		if(firstTime==1) {
			double Pay=100-amount*discount/100;
			System.out.println(Pay +" You need to pay this amount");
		}
		else
		{
			System.out.println("Pay full amount no discount available for this account");
		}
	}
}
