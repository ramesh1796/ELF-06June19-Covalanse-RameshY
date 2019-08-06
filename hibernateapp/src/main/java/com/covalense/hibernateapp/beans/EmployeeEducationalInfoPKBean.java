package com.covalense.hibernateapp.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.covalense.hibernateapp.beans.EmployeeInfoBean;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@Embeddable
public class EmployeeEducationalInfoPKBean implements Serializable {
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;
	@Column(name = "educational_type")
	private String educationalType;
}
