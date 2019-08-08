package com.covalanse.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathOppTest {
	private MathOpp m = new MathOpp();

	@Test
	public void testAddMethod() {
		assertEquals(60, m.add(10, 50));
	}

	@Test
	public void testDivMethod() {
		assertEquals(4, m.div(20, 5));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivForException() {
		m.div(20, 0);

	}

}
