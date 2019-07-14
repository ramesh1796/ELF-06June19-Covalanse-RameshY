package com.covalense.lms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.lms.dto.UserInfoBean;
import com.covalense.lms.dto.UserResponse;
import com.covalense.lms.repository.UserRepository;

//@CrossOrigin(origins="http://localhost:3000")
@RestController
public class LoginController {

	@Autowired
	UserRepository repository;
	
	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(int id, String password, HttpServletRequest request) {
		
		UserResponse response = new UserResponse();
		if(repository.existsById(id)) {
		UserInfoBean bean = repository.findById(id).get();
			if(password.equals(bean.getPassword())){
				
				HttpSession session = request.getSession(true);
				session.setAttribute("userBaen",bean );
				response.setStatusCode(2000);
				response.setMessage("Welcome");
				response.setDescription("You are successfully logged in");
				request.getSession(true);
			}else {
				response.setStatusCode(2001);
				response.setMessage("Invalid Credential");
				response.setDescription("Invalid Credentials. Please try again");
			}
		}else {
			response.setStatusCode(2001);
			response.setMessage("Invalid id");
			response.setDescription("Account doesnot exist. Please create account before you log In");
		}
		return response;
		
	}
	
	@GetMapping(path = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse logout(HttpSession session) {
		session.invalidate();
		UserResponse response = new UserResponse();
		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("Logout successfully");
		return response;
	}
	
}
