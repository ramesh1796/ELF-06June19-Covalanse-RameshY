package com.covalanse.java.implenum;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDate {
	public static void main(String[] args) {
		String msg = "Hello";
		byte[] by = msg.getBytes();
		// FileOutputStream fout;

		try (FileOutputStream fout = new FileOutputStream("vikas.txt")) {
			fout.write(by);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
