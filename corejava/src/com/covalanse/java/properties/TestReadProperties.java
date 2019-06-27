package com.covalanse.java.properties;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class TestReadProperties {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("demo.properties");
			Properties p= new Properties();
			p.load(fin);
			String phone=p.getProperty("Phone");
			String name=p.getProperty("CompanyName");
			log.info("Phone "+phone);
			log.info("Name "+name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}