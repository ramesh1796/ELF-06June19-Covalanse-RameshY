package com.covalanse.java.implenum;

public enum Loan {
HOME(240), PERSONAL(241), CAR(242);
	private int value;
	private Loan(int value) {
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}
