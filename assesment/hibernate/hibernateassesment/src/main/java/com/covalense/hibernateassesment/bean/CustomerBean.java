package com.covalense.hibernateassesment.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class CustomerBean implements Serializable {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="firstname")
    private String firstName;
	@Column(name="lastname")
    private String lastName;
	@Column(name="contactno")
    private long contact;
	@Column(name="address")
    private String address;
	@Column(name="city")
    private String city;
	@Column(name="state")
    private String state;
	@Column(name="country")
    private String country;
}
