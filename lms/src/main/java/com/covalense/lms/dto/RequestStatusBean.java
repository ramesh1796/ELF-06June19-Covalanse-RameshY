package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "user-id")
@Entity
@Table(name = "request_statuse")
public class RequestStatusBean implements Serializable{

	@Id
	@Column(name="rqId")
	private int rqId;
	
	
	@Column(name="bookId")
	private int bookId;
	
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="requestStatus")
	private String requestStatus;
	
	@Column(name="issueDate")
	private Date issueDate;
	
	@Column(name="returnDate")
	private Date returnDate; 
	
	@Column(name="noDays")
	private Integer noDays;
	
	@Column(name="dues")
	private Double dues;

	public int getRqId() {
		return rqId;
	}

	public void setRqId(int rqId) {
		this.rqId = rqId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	

	public Integer getNoDays() {
		return noDays;
	}

	public void setNoDays(Integer noDays) {
		this.noDays = noDays;
	}

	public Double getDues() {
		return dues;
	}

	public void setDues(Double dues) {
		this.dues = dues;
	}
	
	
	
}
