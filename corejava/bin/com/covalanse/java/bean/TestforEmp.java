package com.covalanse.java.bean;

import java.util.logging.Logger;

public class TestforEmp {
	private static final Logger log=Logger.getLogger("Main Method class");
	public static void main(String[] args) {
		Employee2 e=new Employee2();
        e.setId(23);
        e.setDept("hhh");
		log.info("without"+e.toString());
		Employee ee=new Employee();

		log.info("with"+ee.toString());
	}
}
