package com.covalense.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "employee_otherinfo")
public class EmployeeOtherInfoBean {
	 @Id
	 @Column(name="id")
	 private int id;
	 
	 @Column(name="pan")
	 private String pan;
	 
	 @Column(name="ismarried")
	 private boolean isMarried;
	 
	 @Column(name="blood_group")
	 private String bloodGrp;
	 
	 @Column(name="ischallenged")
	 private boolean isChallenged;
	 
	 @Column(name="emergency_contact_no")
	 private long emergencyContactNumber;
	 
	 @Column(name="emergency_contact_name")
	 private String emergencyContactName;
	 
	 @Column(name="nationality")
	 private String nationality;
	 
	 @Column(name="religion")
	 private String religion ;
	 
	 @Column(name="father_nm")
	 private String fatherNm;
	 
	 @Column(name="mother_name")
	 private String motherNm;
	 
	 @Column(name="spouse_nm")
	 private String spouseNm;
	 
	 @Column(name="passport")
	 private String passport;
	 
	 @Column(name="adhaar")
	 private long adhaar;
}
