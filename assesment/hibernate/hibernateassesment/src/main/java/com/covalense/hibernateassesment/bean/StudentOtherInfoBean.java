package com.covalense.hibernateassesment.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="studentotherinfo")
public class StudentOtherInfoBean {
	@Id
	@Column(name="roll")
	private int roll;
	@Column(name="fname")
    private String fname;
	@Column(name="mname")
    private String mname;
	@Column(name="religion")
    private String religion;
	@Column(name="nationality")
    private String nationality;
	

}
