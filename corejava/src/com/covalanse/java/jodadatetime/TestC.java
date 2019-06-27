package com.covalanse.java.jodadatetime;

import java.time.LocalDateTime;

import lombok.extern.java.Log;
@Log
public class TestC {
public static void main(String[] args) {
	LocalDateTime d=LocalDateTime.now();
   log.info(""+d);
}
}
