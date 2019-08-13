package com.covalense.empspringrest.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@SuppressWarnings("serial")
@Entity
@Table(name = "department_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class DepartmentInfoBean implements Serializable {
@Id
@Column(name="dept_id")
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
@Column(name="dept_name")
private String departmentName;
}
