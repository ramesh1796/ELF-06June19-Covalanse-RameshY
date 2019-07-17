package com.covalense.springcore.configurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.MessageBean;

import lombok.extern.java.Log;
@Log
public class MessageTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		((ConfigurableApplicationContext)context).registerShutdownHook();
		MessageBean messageBean= context.getBean(MessageBean.class);
		MessageBean messageBean2= context.getBean(MessageBean.class);
		log.info("Message:1-"+messageBean.getMessage());
		log.info("Message:2-"+messageBean2.getMessage());
		
		messageBean2.setMessage("Welcome to spring");
		log.info("Message:1-"+messageBean.getMessage());
		log.info("Message:2-"+messageBean2.getMessage());
	}

}
