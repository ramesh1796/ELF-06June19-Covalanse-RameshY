package com.covalanse.java.assignment.six;

import java.io.Serializable;

import com.covalanse.java.treeset.Product;

public class ProductBean implements Serializable{
private int pid;
private String name ;
private double cost;
public ProductBean() {
	
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}

}
