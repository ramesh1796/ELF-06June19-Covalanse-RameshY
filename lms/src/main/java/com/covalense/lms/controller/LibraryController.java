package com.covalense.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.lms.dto.BookInfoBean;
import com.covalense.lms.dto.RequestStatusBean;
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
	
	@GetMapping(value = "/viewAllRequest", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse RequestedBooks() {
		UserResponse response = new UserResponse();
		Iterable<RequestStatusBean> beans =rsRepository.findAll();
		response.setStatusCode(201);
		response.setMessage("Successful");
		response.setDescription("Employee Data found");
		response.setStatusbean(beans);
		return response;
	}
	
	@PostMapping(value = "/addBook", produces = MediaType.APPLICATION_JSON_VALUE,
									consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addBook(@RequestBody BookInfoBean bookInfoBean) {
		UserResponse response = new UserResponse();
		if(!bRepository.existsById(bookInfoBean.getBookId())) {
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
	
	/*
	 * @GetMapping(value = "/viewBooks", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public UserResponse
	 * ViewBooksByCatagory(@RequestBody String bookType) { BookInfoBean infoBean =
	 * new BookInfoBean(); if(bookType.equals(infoBean.getCatagory())) {
	 * 
	 * } }
	 */
}
	
