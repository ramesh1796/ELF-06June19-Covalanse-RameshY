package com.covalanse.java.lambdafunction;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
public class TestC {
public static void main(String[] args) {
	Supplier<Car> s=()-> new Car(15.8);
	Car c=s.get();
	log.info(""+c.fuelQty);
}
}
