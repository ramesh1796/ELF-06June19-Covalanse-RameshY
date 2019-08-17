package com.covalense.springboot.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
@SuppressWarnings("serial")
//@XmlAccessorType(XmlAccessType.FIELD)
@Embeddable
public class EmployeeExperienceInfoPKBean implements Serializable {
    
	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id")
    private EmployeeInfoBean infoBean;
	@Column(name="company_name")
	private String companyName;
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
