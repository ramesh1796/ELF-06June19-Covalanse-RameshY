package com.covalanse.java;

import lombok.extern.java.Log;

@Log
public class Grade {
	public static void main(String[] args) {
		int amount=60;
		switch (amount) {
		case 10:
			log.info("Lays");
			break;

		case 20:
			log.info("Kurkure");
			break;

		case 50:
			log.info("Dairy Milk");
			break;

		default:
			log.info("Invalid Option :-)");
			break;
		}
	}
}
