package com.covalanse.java.assignment.six;

import java.io.Serializable;

public class Employee implements Serializable{
private int eid;
private String ename;
public Employee(int eid, String ename) {
	
	this.eid = eid;
	this.ename = ename;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
}
