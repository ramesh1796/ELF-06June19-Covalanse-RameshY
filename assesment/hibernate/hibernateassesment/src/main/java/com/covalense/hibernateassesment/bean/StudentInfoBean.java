package com.covalense.hibernateassesment.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="studentinfo")
public class StudentInfoBean {
	@Id
	@Column(name="roll")
	private int roll;
	
	@PrimaryKeyJoinColumn
	@OneToOne(cascade= CascadeType.ALL)
	private StudentOtherInfoBean stdOtherInfo;
	@Column(name="name")
    private String name;
	@Column(name="age")
    private int age;
	@Column(name="phone")
    private long phone;
	@Column(name="gender")
    private String gender;
	@Column(name="email")
    private String email;
	

}
