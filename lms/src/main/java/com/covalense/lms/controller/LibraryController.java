package com.covalense.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.covalense.lms.dto.BookInfoBean;
import com.covalense.lms.dto.RequestStatusBean;
import com.covalense.lms.dto.UserInfoBean;
import com.covalense.lms.dto.UserResponse;
import com.covalense.lms.repository.BookRepository;
import com.covalense.lms.repository.RequestStatusRepository;
import com.covalense.lms.repository.UserRepository;

@RestController
public class LibraryController {

	@Autowired
	RequestStatusRepository rsRepository;
	@Autowired
	UserRepository uRepository;
	@Autowired
	BookRepository bRepository;

	UserResponse response;

	@GetMapping(value = "/viewAllRequest", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse RequestedBooks() {
		UserResponse response = new UserResponse();
		List<RequestStatusBean> beans=rsRepository.findByReqStatus("requested");
		if(beans!=null) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Request Details found successfully");
			response.setStatusbean(beans);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("");
		}
		return response;
	}

	@PostMapping(value = "/addBook", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addBook(@RequestBody BookInfoBean bookInfoBean) {
		response = new UserResponse();
		if (!bRepository.existsById(bookInfoBean.getBookId())) {
			bRepository.save(bookInfoBean);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Book Data saved successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Book Data could not be saved");
		}
		return response;
	}

	@PostMapping(value = "/addUser", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addUser(@RequestBody UserInfoBean userInfoBean) {
		response = new UserResponse();
		if (!uRepository.existsById(userInfoBean.getUserId())) {
			uRepository.save(userInfoBean);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("User Data saved successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("User Data could not be saved");
		}
		return response;
	}
	
	

}
