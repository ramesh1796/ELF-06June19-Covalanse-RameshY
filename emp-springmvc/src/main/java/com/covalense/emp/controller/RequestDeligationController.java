package com.covalense.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deligate")
public class RequestDeligationController {
	@GetMapping("/getHomePage")
	public String getHomePage() {
		return "homePage";
	}
	@GetMapping("/forwardReq")
	public String forwardReq() {
		return "forward:/forms/getForm";
	}
	@GetMapping(" /redirectReq")
	public String redirectReq() {
		return "redirect:https://www.google.com";
	}
}//end of controller
