package com.covalense.emp.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "department_info")
public class DepartmentInfoBean implements Serializable {
@Id
@Column(name="dept_id")
private int id;
@Column(name="dept_name")
private String departmentName;
}
