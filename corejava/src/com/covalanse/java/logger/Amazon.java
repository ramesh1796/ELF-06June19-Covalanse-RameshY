package com.covalanse.java.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Amazon {
	static Logger loger=Logger.getLogger("amezon");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		try {
			FileHandler fh=new FileHandler("amezon.log");
			fh.setLevel(Level.ALL);
			loger.addHandler(fh);
			loger.log(Level.SEVERE," welcome");
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Register rg= new Register();
		rg.store();
	
	}

}
