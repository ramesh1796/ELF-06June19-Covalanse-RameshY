package com.covalense.springboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
public class LoginController {
	@Autowired
	EmployeeRepository repository;

	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, String password) {
		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(id)) {
			EmployeeInfoBean beans = repository.findById(id).get();
			if (password.equals(beans.getPassword())) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Hurray!!! You have successfully Logged in");
				response.setBeans(Arrays.asList(beans));
			} else {
				response.setStatusCode(401);
				response.setMessage("Failed");
				response.setDescription("Inavlid Cridentials");
			}
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Opps!! Id does not exist!!!!");
		}
		return response;
	}
}
