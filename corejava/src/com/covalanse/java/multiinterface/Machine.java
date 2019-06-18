package com.covalanse.java.multiinterface;

public class Machine {

	void slot(ATMcard a) {
		a.validate();
		a.getInfo();
	}
}
