package com.covalanse.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringOppTest {
    private StringOpp strOpp=new StringOpp();
	@Test
	public void testCountCharInString() {
		int expected=5;
		int actual=strOpp.count("Ramya");
		assertEquals(expected, actual);
	}
    @Test(expected=NullPointerException.class)
    public void testCountInStringForException() {
    	strOpp.count(null);
    }
}
