package com.covalense.hibernateapp.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable {
	
@OneToOne(cascade = CascadeType.ALL, mappedBy ="infoBean")	
private EmployeeOtherInfoBean employeeOtherInfoBean;

@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.infoBean")
private List<EmployeeAddressInfoBean> addressInfoBeans;

@OneToMany(cascade = CascadeType.ALL, mappedBy = "experienceInfoPKBean.infoBean")
private List<EmployeeExperienceInfoBean> experienceInfoBeans;

@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationalInfoPKBean.infoBean")
private List<EmployeeEducationalInfoBean> employeeEducationalInfoBeans;

@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
private List<TrainingInfoBean> trainingInfoBeans;

 @Id
 @Column(name="id")
 private int id;
 @Column(name="name")
 private String name;
 @Column(name="age")
 private int age;
 @Column(name="gender")
 private String gender;
 @Column(name="salary")
 private double salary;
 @Column(name="phone")
 private  long phone;
 @Column(name="joining_date")
 private  Date joiningDate;
 @Column(name="account_no")
 private long accountNumber;
 @Column(name="email")
 private String email;
 @Column(name="designation")
 private String desigtnation;
 @Column(name="dob")
 private Date dob;
 
 @ManyToOne(cascade = CascadeType.ALL )
 @JoinColumn(name="department_id",referencedColumnName = "dept_id")
 private DepartmentInfoBean departmentInfoBean;
 
 @ManyToOne
 @JoinColumn(name="manager_id", referencedColumnName = "id")
 private EmployeeInfoBean managerId;
 @Column(name="password")
 private String password;
  
}
