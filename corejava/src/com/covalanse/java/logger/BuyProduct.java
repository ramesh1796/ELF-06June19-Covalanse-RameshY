package com.covalanse.java.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyProduct {
	static Logger Loger = Logger.getLogger("flipkart");
	void buy() {
	
		Loger.log(Level.SEVERE,"Hi its Sever msg");
		Loger.log(Level.WARNING,"Hi its WARNNING msg");
		Loger.log(Level.INFO,"Hi its INFO msg");
		Loger.log(Level.CONFIG,"Hi its CONFIG msg");
	}

}
