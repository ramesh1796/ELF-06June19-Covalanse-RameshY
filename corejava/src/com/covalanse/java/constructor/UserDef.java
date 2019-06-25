package com.covalanse.java.constructor;

import lombok.extern.java.Log;

@Log
public class UserDef {
  UserDef(int x){
	  log.info(" Int type constructor called"+x);
  }
  UserDef(double a){
	  log.info("double type constructor callled"+a);
  }
}
