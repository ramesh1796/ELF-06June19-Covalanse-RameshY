package com.covalense.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/session")
public class SessionController {
	@GetMapping("/loginForm")
  public String login() {
	return "Login";
	  
  }
	@PostMapping("/login")
	public String authenticate() {
		return "Login";
		  
	  }
}
