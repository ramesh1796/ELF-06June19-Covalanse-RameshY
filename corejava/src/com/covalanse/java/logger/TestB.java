package com.covalanse.java.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestB {
	private static Logger Loger = Logger.getLogger("flipkart");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		try {
			FileHandler fh= new FileHandler("myFavLogData",true);
			fh.setLevel(Level.SEVERE);
			fh.setFormatter(new SimpleFormatter());
			Loger.addHandler(fh);
		    Loger.log(Level.SEVERE, "Hi its s sever");
			
			BuyProduct by=new BuyProduct();
			by.buy();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	 

}
