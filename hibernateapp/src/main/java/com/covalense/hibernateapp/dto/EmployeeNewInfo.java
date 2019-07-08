package com.covalense.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="newemp_info")
public class EmployeeNewInfo {
@Id
@Column(name="eid")
private int eid;
@Column(name="name")
private String name;
@Column(name="email")
private String email;
}
