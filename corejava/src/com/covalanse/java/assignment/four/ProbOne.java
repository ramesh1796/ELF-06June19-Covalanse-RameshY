package com.covalanse.java.assignment.four;

import java.io.File;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class ProbOne {
	public static void main(String[] args) {
		File f=new File("file1.text");
		try {
			boolean res=f.createNewFile();
			log.info("result is "+res);
			log.info("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
