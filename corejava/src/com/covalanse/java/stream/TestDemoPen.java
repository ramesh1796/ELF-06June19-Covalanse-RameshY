package com.covalanse.java.stream;

import lombok.extern.java.Log;

@Log
public class TestDemoPen {
public static void main(String[] args) {
	
	Pen p=new Pen();
	Demo a=p::write;
	a.print(10);
	
	
	
	Demo d=x->log.info("");
	d.print(5);
}
}
