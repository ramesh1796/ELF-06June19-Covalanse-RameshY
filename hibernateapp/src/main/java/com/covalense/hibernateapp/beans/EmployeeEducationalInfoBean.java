package com.covalense.hibernateapp.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@Table(name = "employee_educational_info")
@Entity
public class EmployeeEducationalInfoBean implements Serializable {
	@EmbeddedId
	private EmployeeEducationalInfoPKBean educationalInfoPKBean;
	@Column(name = "college_nm")
	private String collegeName;
	@Column(name = "university")
	private String university;
	@Column(name = "loaction")
	private String loaction;
	@Column(name = "percentage")
	private double percentage;
	@Column(name = "yop")
	private Date yop;

}
