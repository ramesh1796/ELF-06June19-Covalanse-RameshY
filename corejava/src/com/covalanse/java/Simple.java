package com.covalanse.java;

import lombok.extern.java.Log;

@Log
public class Simple {
public static void main(String[] args) {
	int P=15000, T=2; double r=14.92;
	log.info(""+P*T*r/100);
	log.info(""+1024*1024*1024*2l);
}
}
