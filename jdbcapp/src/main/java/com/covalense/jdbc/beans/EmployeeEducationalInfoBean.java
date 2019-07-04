package com.covalense.jdbc.beans;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeEducationalInfoBean {
private int id;
private String educationType;
private String collegeNm;
private String university;
private Date yop;
private double percentage;
private String loaction;
}
