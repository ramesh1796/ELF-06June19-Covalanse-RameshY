package com.covalanse.java.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class TestE {
	public static void main(String[] args) {
		String msg="Ding ding digana .... dum dum dagana";
		char[] c=msg.toCharArray();
		FileWriter fw;
		try {
			fw = new FileWriter("pom.txt");
			fw.write(c);
			System.out.println("done..");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
