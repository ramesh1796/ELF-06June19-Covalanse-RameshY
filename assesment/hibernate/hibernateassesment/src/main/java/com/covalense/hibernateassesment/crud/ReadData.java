package com.covalense.hibernateassesment.crud;

import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateassesment.bean.CustomerBean;

import lombok.extern.java.Log;
@Log
public class ReadData {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory= configuration.buildSessionFactory();
		Session session = factory.openSession();
        CustomerBean customerBean = new CustomerBean();
        customerBean =  session.get(CustomerBean.class, 123);
        log.info("id"+customerBean.getId());
        log.info("First Name"+customerBean.getFirstName());
        log.info("Last Name"+customerBean.getLastName());
        log.info("Address"+customerBean.getAddress());
        log.info("City"+customerBean.getCity());
        log.info("State"+customerBean.getState());
        log.info("Country"+customerBean.getCountry());
        session.close();
}
}
