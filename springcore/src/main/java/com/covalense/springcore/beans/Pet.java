package com.covalense.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Pet {
	
private String name;	
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Autowired
//@Qualifier("donkey")
private Animal animal;

public Animal getAnimal() {
	return animal;
}

public void setAnimal(Animal animal) {
	this.animal = animal;
}
public void doSomthing() {
	animal.eat();
	animal.makeSound();
}

}
