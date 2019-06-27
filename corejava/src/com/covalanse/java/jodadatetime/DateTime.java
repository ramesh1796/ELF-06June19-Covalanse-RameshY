package com.covalanse.java.jodadatetime;

import java.time.LocalDate;

import lombok.extern.java.Log;
@Log
public class DateTime {
public static void main(String[] args) {
	LocalDate a=LocalDate.now();
	log.info(""+a);
	log.info(""+a.getDayOfMonth());//current day in month
	log.info(""+a.getDayOfYear());
	log.info(""+a.getMonthValue());
	log.info(""+a.getDayOfWeek());
	
}
}
