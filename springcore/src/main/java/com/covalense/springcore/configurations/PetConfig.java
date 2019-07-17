package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.beans.Animal;
import com.covalense.springcore.beans.Donkey;
import com.covalense.springcore.beans.Monkey;
import com.covalense.springcore.beans.Pet;
@Configuration
public class PetConfig {
	@Bean(name="monkey")
	public Animal getDonkey() {
		return new Monkey();
		
	}
	@Bean(name="donkey")
	public Animal getMokey() {
		return new Donkey();
		
	}
	@Bean
	public Pet getPet() {
		return new Pet();
		
	}
}
