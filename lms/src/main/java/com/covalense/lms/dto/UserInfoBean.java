package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@SuppressWarnings("serial")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "user-id")
@Entity
@Table(name = "user_info")

public class UserInfoBean implements Serializable{

	@Id
	@Column(name = "userId")
	private int userId;
	
	@JsonProperty(value = "user_name")
	@Column(name = "userName")
	private String userName;
	
	@JsonProperty(value = "user_type")
	@Column(name = "userType")
	private String userType;
	
	@JsonProperty(value = "password")
	@Column(name = "password")
	private String password;
	
	@JsonProperty(value = "email")
	@Column(name = "email")
	private String email;
	
	@JsonProperty(value = "address")
	@Column(name = "address")
	private String address;
	
	@JsonProperty(value = "contact")
	@Column(name = "contact")
	private Long contact;
	
	@JsonProperty(value = "expiry_date")
	@Column(name = "expiryDate")
	private Date expiryDate;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	
}
