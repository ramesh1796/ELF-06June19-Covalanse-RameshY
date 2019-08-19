package com.covalense.springboot.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "employee-response")
public class EmployeeResponse {

	private int statusCode;
	private String message;
	private String description; 
	private List<EmployeeInfoBean> beans;
	private Iterable<EmployeeInfoBean> bean;
	
	public Iterable<EmployeeInfoBean> getBean() {
		return bean;
	}
	public void setBean(Iterable<EmployeeInfoBean> bean) {
		this.bean = bean;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<EmployeeInfoBean> getBeans() {
		return beans;
	}
	public void setBeans(List<EmployeeInfoBean> beans) {
		this.beans = beans;
	}
	
}
