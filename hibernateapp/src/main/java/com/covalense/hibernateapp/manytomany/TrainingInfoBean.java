package com.covalense.hibernateapp.manytomany;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Table(name = "training_info")
@Entity
public class TrainingInfoBean {
    @Id
	@Column(name="course_id")
	private int courseId;
    @Column(name="course_name")
	private String courseName;
	@Column(name="duration")
	private int duration;
	@Column(name="course_type")  
	private String courseType;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_training", 
	joinColumns = {@JoinColumn(name="course_id")},
	inverseJoinColumns = {@JoinColumn(name="id")})
	
	List<EmployeeInfoBean> infoBeans;
	
}
