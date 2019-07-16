package com.covalense.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.java.Log;
@Log

public class EmployeeInfoBean{
	private String name;
    private int id;
    private DepartmentBean dept;
    
	public DepartmentBean getDept() {
		return dept;
	}
	public void setDept(DepartmentBean dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
