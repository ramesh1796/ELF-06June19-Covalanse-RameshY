package com.covalanse.java.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class TestProperties {
public static void main(String[] args) {
	try {
		FileOutputStream fout = new FileOutputStream("demo.properties");
		Properties p= new Properties();
		p.setProperty("CompanyName", "Covalense");
		p.setProperty("Phone", "9999999999");
		p.store(fout, "Company details");
		log.info("Created the file");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
