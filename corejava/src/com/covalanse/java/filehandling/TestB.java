package com.covalanse.java.filehandling;

import java.io.File;


import lombok.extern.java.Log;
@Log
public class TestB {
	public static void main(String[] args) {
		File f=new File("movies/kannada/new");
		boolean res=f.mkdirs();
		log.info("result "+res);
		
	}

}
