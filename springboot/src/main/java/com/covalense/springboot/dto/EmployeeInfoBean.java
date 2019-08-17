package com.covalense.springboot.dto;

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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee_info")
//@XmlRootElement(name = "employee-info-bean")
@JsonRootName(value = "employee-info-bean")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EmployeeInfoBean implements Serializable {

	//@XmlElement(name = "other-info")
	@JsonProperty(value = "other-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;

	@JsonProperty(value = "address-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBeans;

	@JsonProperty(value = "experience-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "experienceInfoPKBean.infoBean")
	private List<EmployeeExperienceInfoBean> experienceInfoBeans;

	@JsonProperty(value = "education-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationalInfoPKBean.infoBean")
	private List<EmployeeEducationalInfoBean> employeeEducationalInfoBeans;

	@JsonProperty(value = "training-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBeans;

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "salary")
	private double salary;
	@Column(name = "phone")
	private long phone;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "account_no")
	private long accountNumber;
	@Column(name = "email")
	private String email;
	@Column(name = "designation")
	private String designation;
	@Column(name = "dob")
	private Date dob;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id", referencedColumnName = "dept_id")
	private DepartmentInfoBean departmentInfoBean;

	@ManyToOne
	@JoinColumn(name = "manager_id", referencedColumnName = "id")
	private EmployeeInfoBean managerId;
	@Column(name = "password")
	private String password;

	public EmployeeOtherInfoBean getEmployeeOtherInfoBean() {
		return employeeOtherInfoBean;
	}

	public void setEmployeeOtherInfoBean(EmployeeOtherInfoBean employeeOtherInfoBean) {
		this.employeeOtherInfoBean = employeeOtherInfoBean;
	}

	public List<EmployeeAddressInfoBean> getAddressInfoBeans() {
		return addressInfoBeans;
	}

	public void setAddressInfoBeans(List<EmployeeAddressInfoBean> addressInfoBeans) {
		this.addressInfoBeans = addressInfoBeans;
	}

	public List<EmployeeExperienceInfoBean> getExperienceInfoBeans() {
		return experienceInfoBeans;
	}

	public void setExperienceInfoBeans(List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		this.experienceInfoBeans = experienceInfoBeans;
	}

	public List<EmployeeEducationalInfoBean> getEmployeeEducationalInfoBeans() {
		return employeeEducationalInfoBeans;
	}

	public void setEmployeeEducationalInfoBeans(List<EmployeeEducationalInfoBean> employeeEducationalInfoBeans) {
		this.employeeEducationalInfoBeans = employeeEducationalInfoBeans;
	}

	public List<TrainingInfoBean> getTrainingInfoBeans() {
		return trainingInfoBeans;
	}

	public void setTrainingInfoBeans(List<TrainingInfoBean> trainingInfoBeans) {
		this.trainingInfoBeans = trainingInfoBeans;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public DepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}

	public void setDepartmentInfoBean(DepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}

	public EmployeeInfoBean getManagerId() {
		return managerId;
	}

	public void setManagerId(EmployeeInfoBean managerId) {
		this.managerId = managerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
