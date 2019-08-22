package com.covalense.lms.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "user-id")
@Entity
@Table(name = "request_statuses")
public class RequestStatusBean implements Serializable{

	@Id
	@Column(name="request_statusid")
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//@JsonProperty(value = "request_status")
	@Column(name="request_status")
	private int requestStatus;

	public int getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(int requestStatus) {
		this.requestStatus = requestStatus;
	}
	
	
}
