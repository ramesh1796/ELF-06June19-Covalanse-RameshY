package com.covalanse.java.assignment.three;

import lombok.extern.java.Log;

@Log
public class StudentImp {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setRoll(1);
		std1.setEmail("abc@gmail.com");
		std1.setGen('M');
		std1.setName("Mayur");
		Student std2 = new Student();
		std2.setRoll(2);
		std2.setEmail("bcd@gmail.com");
		std2.setGen('M');
		std2.setName("Mayanku");
		Student std3 = new Student();
		std3.setRoll(3);
		std3.setEmail("Feli@gmail.com");
		std3.setGen('F');
		std3.setName("Felicity");
		Student std4 = new Student();
		std4.setRoll(4);
		std4.setEmail("fhb@gmail.com");
		std4.setGen('F');
		std4.setName("Farheen");
		Student[] std = new Student[4];
		std[0] = std1;
		std[1] = std2;
		std[2] = std3;
		std[3] = std4;
		for (int i = 0; i < std.length; i++) {
			log.info("Roll no is " + std[i].getRoll());
			log.info("Name is " + std[i].getName());
			log.info("Email is " + std[i].getEmail());
			log.info("Gender is " + std[i].getGen());
			log.info("********************");
		}
	}

}
