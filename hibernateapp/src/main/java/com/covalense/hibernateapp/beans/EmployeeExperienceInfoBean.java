package com.covalense.hibernateapp.beans;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "employee_experience_info")
@Entity
public class EmployeeExperienceInfoBean {
	@EmbeddedId
	private EmployeeExperienceInfoPKBean experienceInfoPKBean;
	@Column(name = "designation")
	private String designation;
	@Column(name = "joiningDate")
	private Date joiningDate;
	@Column(name = "leavingDate")
	private Date leavingDate;

}
