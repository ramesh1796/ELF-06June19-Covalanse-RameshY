package com.covalanse.java.jodadatetime;

import java.time.LocalDate;
import java.time.Period;

import lombok.extern.java.Log;
@Log
public class Birth {
	
public static void main(String[] args) {
	
	LocalDate bir=LocalDate.of(1947,8,15);
	LocalDate cur=LocalDate.now();
	Period p=Period.between(bir, cur);
	
	log.info(""+p.getYears());
	log.info(""+p.getMonths());
	log.info(""+p.getDays());
	
}
}
