package com.covalense.warehouse.beans;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

public class HibernateConfig {
@Bean
 public SessionFactory getSessionFactory() {
	
	return new Configuration().configure().buildSessionFactory();
	 
 }
}
