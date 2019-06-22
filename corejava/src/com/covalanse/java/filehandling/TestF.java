package com.covalanse.java.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class TestF {
	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("poem.text");
			int i;
			while( (i=fin.read())!= -1) {
				log.info(""+(char)i);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
