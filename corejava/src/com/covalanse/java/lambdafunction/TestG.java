package com.covalanse.java.lambdafunction;

import lombok.extern.java.Log;

@Log
public class TestG {
  static void open(int y){
		log.info("**open method**");
		log.info("open gate"+y);
	}
public static void main(String[] args) {
	Room r=TestG::open;
	r.remove(12);
}
}
