package com.covalanse.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class TestG {
	public static void main(String[] args) {
		FileReader fin;
		try {
			fin = new FileReader("pom.txt");
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
