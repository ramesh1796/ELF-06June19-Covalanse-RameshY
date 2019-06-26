package com.covalanse.java.implenum;

import lombok.extern.java.Log;

@Log
public class TestLoan {
	public static void main(String[] args) {
		Loan t= Loan.HOME;
		int constValue=t.getValue();
		log.info("Value of home loan "+constValue);
		Loan t2= Loan.PERSONAL;
		int constValue2=t2.getValue();
		log.info("Value of Personal loan "+constValue2);
	}
}
