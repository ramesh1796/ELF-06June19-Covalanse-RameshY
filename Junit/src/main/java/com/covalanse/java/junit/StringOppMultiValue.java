package com.covalanse.java.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class StringOppMultiValue {
	
	
	
StringOpp str=new StringOpp();


private String name;
private int value;



public StringOppMultiValue(String name, int value) {

	this.name = name;
	this.value = value;
}



@Parameters
public static Collection<Object[]>getPairs(){
	Object[][] obj= {{"Apple",5},{"raju",4},{"Raja Ram",8}};
	return Arrays.asList(obj);
}
@Test
public void  testcountCharInString() {
	int res=str.count(name);
	assertEquals(value, res);
}
}
