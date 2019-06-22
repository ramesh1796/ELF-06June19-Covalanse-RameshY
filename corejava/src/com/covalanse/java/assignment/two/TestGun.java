package com.covalanse.java.assignment.two;

import lombok.extern.java.Log;

@Log
public class TestGun {
   public static void main(String[] args) {
	Bullet bullet1 =new Bullet();
	Bullet bullet2 =new Bullet();
	Bullet bullet3 =new Bullet();
	Bullet bullet4 =new Bullet();
	Bullet bullet5 =new Bullet();
	Bullet bullet6 =new Bullet();
	Gun gun =new Gun();
	gun.loaded(bullet1);
	gun.loaded(bullet2);
	gun.loaded(bullet3);
	gun.loaded(bullet4);
	gun.loaded(bullet5);
	gun.loaded(bullet6);
	log.info("Gun is loaded");
	
}
}
