package com.covalanse.java.jodadatetime;

import java.time.LocalDate;
import java.time.Period;

import lombok.extern.java.Log;
@Log
public class TestD {
	public static void main(String[] args) {
		
		LocalDate bir=LocalDate.of(1947,8,15);
		LocalDate dead=bir.plusYears(60);
		Period p=Period.between(bir, dead);
		int total=p.getYears()*365+p.getMonths()*30+p.getDays();
		
		log.info(""+total);
		
	}
}
