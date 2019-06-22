package com.covalanse.java.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
Logger loger=Logger.getLogger("amezon");
void connectedDB() {
	loger.log(Level.CONFIG,"DB connected");
	//System.out.println("connected");
}
void store() {
	loger.log(Level.SEVERE, "storing");
	//System.out.println("storing data");
}
}
