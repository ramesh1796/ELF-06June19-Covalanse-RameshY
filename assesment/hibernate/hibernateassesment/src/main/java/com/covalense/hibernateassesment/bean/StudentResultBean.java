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
@Table(name="studentresult")
public class StudentResultBean {
	@Id
	@Column(name="roll")
	private int roll;
	@Column(name="fname")
    private String fname;
	@Column(name="lname")
    private String lname;
	@Column(name="subject")
    private String subject;
	@Column(name="marks")
    private double marks;
	

}
