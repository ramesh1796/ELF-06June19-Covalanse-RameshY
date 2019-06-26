package com.covalanse.java.implenum;
import lombok.extern.java.Log;

@Log
public class TestC {
public static void main(String[] args) {
	Gender t= Gender.FEMALE;
	switch (t) {
	case MALE:log.info("Its Male Gender");
		
		break;
case FEMALE:log.info("Its Female Gender");
		
		break;
case OTHER:log.info("Its cross Gender");
	
	break;

	
	}
}
}
