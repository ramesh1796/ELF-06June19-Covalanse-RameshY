package com.covalanse.java.assignmentthree;

public class Product {
	private int pid;
	private double cost;
	private String name;
	public Product() {
		
	}
	
	public Product(int pid, double cost, String name) {
		super();
		this.pid = pid;
		this.cost = cost;
		this.name = name;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    

}
