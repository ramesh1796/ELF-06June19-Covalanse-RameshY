package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.covalense.springcore.beans.MessageBean;

@Configuration
public class MessageConfig {
	@Bean
	@Scope("prototype")
	public MessageBean getMessageBean() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Hiiiiiiiiiiiiiiiiiiiiii");
		return messageBean;
		
	}

}
