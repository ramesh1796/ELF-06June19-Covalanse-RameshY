package com.covalanse.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestC { 
	public static void main(String[] args) {
		String msg="Hi all good evening";
		byte b[]= msg.getBytes();
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("myFile.text");
			fout.write(b);
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
 		
	}

}
