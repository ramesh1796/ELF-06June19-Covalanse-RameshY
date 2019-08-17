package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@SuppressWarnings("serial")
@Embeddable
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeAdreessPKBean implements Serializable {
	
	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	@Column(name = "address_type")
	private String addressType;
}
