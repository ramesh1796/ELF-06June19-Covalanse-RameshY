package com.covalanse.java.logger;

import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;

public class TestA {
	private static final Logger Loger = Logger.getLogger("Felicity");
    public static void main(String[] args) {
    	
    	LogManager.getLogManager().reset();
    	Loger.setLevel(Level.ALL);
    	ConsoleHandler ch= new ConsoleHandler();
    	ch.setLevel(Level.CONFIG);
    	Loger.addHandler(ch);
		Loger.log(Level.SEVERE,"Hi its Sever msg");
		Loger.log(Level.WARNING,"Hi its WARNNING msg");
		Loger.log(Level.INFO,"Hi its INFO msg");
		Loger.log(Level.CONFIG,"Hi its CONFIG msg");
		Loger.log(Level.FINE,"Hi its FINE msg");
		Loger.log(Level.FINER,"Hi its FINER msg");
		Loger.log(Level.FINEST,"Hi its FINEST msg");
	}
}
