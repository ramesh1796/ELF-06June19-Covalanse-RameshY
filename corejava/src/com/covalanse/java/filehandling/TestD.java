package com.covalanse.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestD {
public static void main(String[] args) {
	String msg="Twinkle twikle little star";
	byte b[]= msg.getBytes();
	FileOutputStream fout;
	try {
		fout = new FileOutputStream("poem.text",true);
		fout.write(b);
		fout.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
