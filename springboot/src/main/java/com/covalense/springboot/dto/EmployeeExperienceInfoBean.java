package com.covalense.springboot.dto;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Table(name = "employee_experience_info")
@Entity
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeExperienceInfoBean {
	@EmbeddedId
	private EmployeeExperienceInfoPKBean experienceInfoPKBean;
	@Column(name = "designation")
	private String designation;
	@Column(name = "joiningDate")
	private Date joiningDate;
	@Column(name = "leavingDate")
	private Date leavingDate;
	public EmployeeExperienceInfoPKBean getExperienceInfoPKBean() {
		return experienceInfoPKBean;
	}
	public void setExperienceInfoPKBean(EmployeeExperienceInfoPKBean experienceInfoPKBean) {
		this.experienceInfoPKBean = experienceInfoPKBean;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Date getLeavingDate() {
		return leavingDate;
	}
	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}

}
