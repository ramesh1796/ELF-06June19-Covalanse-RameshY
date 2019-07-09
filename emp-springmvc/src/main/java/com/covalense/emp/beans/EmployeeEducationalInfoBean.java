package com.covalense.emp.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Table(name = "employee_educational_info")
@Entity
public class EmployeeEducationalInfoBean implements Serializable {
	@EmbeddedId
	private EmployeeEducationalInfoPKBean educationalInfoPKBean;
	@Column(name = "degree_type")
	private String degreeType;
	@Column(name = "branch")
	private String branch;
	@Column(name = "college_nm")
	private String collegeName;
	@Column(name = "university")
	private String university;
	@Column(name = "location")
	private String location;
	@Column(name = "percentage")
	private double percentage;
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	@Temporal(TemporalType.DATE)
	@Column(name = "yop")
	private Date yop;

}
