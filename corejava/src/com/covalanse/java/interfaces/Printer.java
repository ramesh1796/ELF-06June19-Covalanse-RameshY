package com.covalanse.java.interfaces;

public interface Printer {
	void print();

}
class Sony implements Printer{
	public void print() {
		System.out.println("Print Method");
	}
}
