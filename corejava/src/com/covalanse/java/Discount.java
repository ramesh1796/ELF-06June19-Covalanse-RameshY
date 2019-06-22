package com.covalanse.java;

import lombok.extern.java.Log;

@Log
public class Discount {
	public static void main(String[] args) {
		int amount=100;
		double discount=15.2;
		int firstTime=1;
		if(firstTime==1) {
			double pay=100-amount*discount/100;
			log.info(pay +" You need to pay this amount");
		}
		else
		{
			log.info("Pay full amount no discount available for this account");
		}
	}
}
