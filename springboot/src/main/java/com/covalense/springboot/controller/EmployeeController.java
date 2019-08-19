package com.covalense.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeAddressInfoBean;
import com.covalense.springboot.dto.EmployeeEducationalInfoBean;
import com.covalense.springboot.dto.EmployeeExperienceInfoBean;
import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeOtherInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Hello World";

	}

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {

		bean.getEmployeeOtherInfoBean().setInfoBean(bean);
		for (EmployeeAddressInfoBean addressInfoBean : bean.getAddressInfoBeans()) {
			addressInfoBean.getAddressPKBean().setInfoBean(bean);
		}
		for (EmployeeEducationalInfoBean educationalInfoBean : bean.getEmployeeEducationalInfoBeans()) {
			educationalInfoBean.getEducationalInfoPKBean().setInfoBean(bean);
		}
		for (EmployeeExperienceInfoBean experienceInfoBean : bean.getExperienceInfoBeans()) {
			experienceInfoBean.getExperienceInfoPKBean().setInfoBean(bean);
		}

		EmployeeInfoBean manager = bean.getManagerId();
		if(manager!=null) {
		manager = repository.findById(manager.getId()).get();
		bean.setManagerId(manager);
		}
		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(bean.getId())) {
			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee not data added to db");
		}
		return response;
	}

	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean) {

		bean.getEmployeeOtherInfoBean().setInfoBean(bean);
		for (EmployeeAddressInfoBean addressInfoBean : bean.getAddressInfoBeans()) {
			addressInfoBean.getAddressPKBean().setInfoBean(bean);
		}
		for (EmployeeEducationalInfoBean educationalInfoBean : bean.getEmployeeEducationalInfoBeans()) {
			educationalInfoBean.getEducationalInfoPKBean().setInfoBean(bean);
		}
		for (EmployeeExperienceInfoBean experienceInfoBean : bean.getExperienceInfoBeans()) {
			experienceInfoBean.getExperienceInfoPKBean().setInfoBean(bean);
		}
		EmployeeInfoBean manager = bean.getManagerId();
		if(manager!=null) {
		manager = repository.findById(manager.getId()).get();
		bean.setManagerId(manager);
		}
		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(bean.getId())) {
			bean.getEmployeeOtherInfoBean()
			.setOtherInfoId(repository
					.findByEmpId(bean)
					.getOtherInfoId());
			
			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee not data added to db");
		}
		return response;
	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(int id) {

		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(id)) {
			EmployeeInfoBean bean = repository.findById(id).get();
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data found successfully");
			response.setBeans(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee not data found");
		}
		return response;
	}
	
	@GetMapping(path = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() {

		EmployeeResponse response = new EmployeeResponse();
		Iterable<EmployeeInfoBean> beans = repository.findAll() ;
		if (beans!=null) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data found successfully");
			response.setBean(beans);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee not data found");
		}
		return response;
	}

	@DeleteMapping(path = "/deleteEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(id)) {
			repository.deleteById(id);
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee data delete successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Not deleted");
		}
		return response;
	}
	@GetMapping(value = "/getotherinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeOtherInfoBean getOtherInfo(int id) {
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		return repository.findByEmpId(bean);
	}
}
