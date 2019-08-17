package com.covalense.springboot.dto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Table(name = "training_info")
@Entity
//@XmlAccessorType(XmlAccessType.FIELD)
public class TrainingInfoBean implements Serializable{
    
	@Id
	@Column(name="course_id")
	private int courseId;
    @Column(name="course_name")
	private String courseName;
	@Column(name="duration")
	private int duration;
	@Column(name="course_type")  
	private String courseType;
	
	//@XmlTransient
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_training", 
	joinColumns = {@JoinColumn(name="course_id")},
	inverseJoinColumns = {@JoinColumn(name="id")})
	
	List<EmployeeInfoBean> infoBeans;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public List<EmployeeInfoBean> getInfoBeans() {
		return infoBeans;
	}

	public void setInfoBeans(List<EmployeeInfoBean> infoBeans) {
		this.infoBeans = infoBeans;
	}
	
}
