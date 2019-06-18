package com.covalanse.java;

public class Grade {
	public static void main(String[] args) {
		int amount=60;
		switch (amount) {
		case 10:
			System.out.println("Lays");
			break;

		case 20:
			System.out.println("Kurkure");
			break;

		case 50:
			System.out.println("Dairy Milk");
			break;

		default:
			System.out.println("Invalid Option :-)");
			break;
		}
	}
}
