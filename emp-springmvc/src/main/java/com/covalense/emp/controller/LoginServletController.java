package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactoryOld;

@Controller
@RequestMapping("/loginOld")
@PropertySource("classpath:emp.properties")
public class LoginServletController {
	@GetMapping("/getLoginForm")
	public String getForm() {
		return "Login";
	}

	@PostMapping("/authentication")
	public String authentication(int id, String password, ModelMap modelMap, HttpServletRequest req ,@Value("${dbInteractionType}") String dbInteractionType) {
		EmployeeDAO dao = EmployeeDAOFactoryOld.getInstance(dbInteractionType);
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		String mssg = "";
		if (bean == null || password.equals(bean.getPassword())) {
			HttpSession session = req.getSession(true);
			mssg = "Successfully Login!!";
			modelMap.addAttribute("msg", mssg);
			return "searchemp";
		} else {
			mssg = "Opps!!!!UserName or password incorrect!!";
			modelMap.addAttribute("msg", mssg);
			return "Login";
		}

	}
	@GetMapping("/logout")
	public String invalidate(ModelMap modelMap, HttpSession session) {
		session.invalidate();
		String mssg = "Successfully Logout!!";
		modelMap.addAttribute("msg", mssg);
		return "Login";
		
	}

	/*
	 * @GetMapping("/validate2") public String validateSession(ModelMap modelMap,
	 * HttpSession session, @RequestParam String url) { if(session.isNew()) {
	 * session.invalidate(); modelMap.addAttribute("msg", "Please Login First");
	 * return "Login"; } return url; }
	 */
	@GetMapping("/validate/{url}")
	public String validateSession3(ModelMap modelMap, HttpServletRequest req, @Value("${msg}") String msg,@PathVariable("url") String url) {
		if(req.getSession(false)==null) {
		modelMap.addAttribute("msg", "Please Login First");
		return "Login";
		}
		return "forward:/login/"+url;
	}
	
	/*
	 * @GetMapping("/validate") public String validateSession(ModelMap modelMap,
	 * HttpServletRequest req, @RequestParam String url,@Value("${msg}") String msg)
	 * {
	 * 
	 * if(req.getSession(false)==null) { modelMap.addAttribute("msg",
	 * "Please Login First"); return "Login"; } return "forward:/login/"+url; }
	 * 
	 * @PostMapping("/validate") public String validateSession4Post(ModelMap
	 * modelMap,HttpServletRequest req, @RequestParam("url") String url) { return
	 * validateSession(modelMap,req,url,"msg"); }
	 */
	@GetMapping("/search")
	//public String getSearch(int id, ModelMap modelMap, HttpServletRequest req)
	public String getSearch(int id, ModelMap modelMap, HttpServletRequest req,@Value("${dbInteractionType}") String dbInteractionType) {
		EmployeeDAO dao = EmployeeDAOFactoryOld.getInstance(dbInteractionType);
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		modelMap.addAttribute("bean", bean);
		return "newhome";
		

	}
	
}
