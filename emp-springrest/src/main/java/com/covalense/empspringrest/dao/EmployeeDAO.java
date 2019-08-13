package com.covalense.empspringrest.dao;

import java.util.List;

import com.covalense.empspringrest.dto.EmployeeInfoBean;


public interface EmployeeDAO {
	List<EmployeeInfoBean> getAllEmployeeInfo();
	EmployeeInfoBean getEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id);
	List<EmployeeInfoBean> searchById(int id);
	boolean createEmployeeInfo(EmployeeInfoBean bean);
	boolean updateEmployeeInfo(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);
}//end of interface
