package com.covalense.springboot.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
@SuppressWarnings("serial")
@Entity
@Table(name = "employee_otherinfo")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeOtherInfoBean implements Serializable{
	 
	 //@XmlTransient
	@JsonIgnore
	 @Id
	 @OneToOne
	 @JoinColumn(name="id")
	 private EmployeeInfoBean infoBean;
	 
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

	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}

	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public String getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	public boolean isChallenged() {
		return isChallenged;
	}

	public void setChallenged(boolean isChallenged) {
		this.isChallenged = isChallenged;
	}

	public long getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(long emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFatherNm() {
		return fatherNm;
	}

	public void setFatherNm(String fatherNm) {
		this.fatherNm = fatherNm;
	}

	public String getMotherNm() {
		return motherNm;
	}

	public void setMotherNm(String motherNm) {
		this.motherNm = motherNm;
	}

	public String getSpouseNm() {
		return spouseNm;
	}

	public void setSpouseNm(String spouseNm) {
		this.spouseNm = spouseNm;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public long getAdhaar() {
		return adhaar;
	}

	public void setAdhaar(long adhaar) {
		this.adhaar = adhaar;
	}
}
