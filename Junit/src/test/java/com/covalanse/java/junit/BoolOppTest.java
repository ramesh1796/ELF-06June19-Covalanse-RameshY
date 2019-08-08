package com.covalanse.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoolOppTest {
  private BoolOpp b= new BoolOpp();
	@Test
	public void test() {
		assertEquals(false, b.odd(20));
	}

}
