package com.covalense.emp.beans;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Table(name = "employee_experience_info")
@Entity
public class EmployeeExperienceInfoBean {
	@EmbeddedId
	private EmployeeExperienceInfoPKBean experienceInfoPKBean;
	@Column(name = "designation")
	private String designation;
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	@Temporal(TemporalType.DATE)
	@Column(name = "joiningDate")
	private Date joiningDate;
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	@Temporal(TemporalType.DATE)
	@Column(name = "leavingDate")
	private Date leavingDate;

}
