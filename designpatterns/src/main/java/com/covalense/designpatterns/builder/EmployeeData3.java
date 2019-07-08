package com.covalense.designpatterns.builder;

import java.util.Date;

import lombok.Builder;

@Builder
public class EmployeeData3 {

	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joiningDate;
	private long accountNumber;
	private String email;
	private String desigtnation;
	private Date dob;
	private int departmentId;
	private int managerId;

}
