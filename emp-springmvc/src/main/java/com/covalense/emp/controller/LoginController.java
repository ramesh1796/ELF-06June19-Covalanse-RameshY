package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.commons.EmpConstant;
import com.covalense.emp.dao.EmployeeDAO;

@Controller
@RequestMapping("/login")
@PropertySource(EmpConstant.PROP_FILE)
public class LoginController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@GetMapping("/loginPage")
	public String getForm() {
		return EmpConstant.VIEW_LOGINPAGE;
	}
    
	@GetMapping("/registraion")
	public String getRegistrationForm() {
		return EmpConstant.GET_REGISTRATION_PAGE;
	}
	@PostMapping("/registraionForm")
	public String registrationForm(EmployeeInfoBean infoBean, ModelMap modelMap,
			@Value("${registraionFailed}") String registraionFailed,
			@Value("${registraionSuccess}") String registraionSuccess) {
	      if(dao.createEmployeeInfo(infoBean)) {
	    	  modelMap.addAttribute("registraionSuccess",registraionSuccess );
	    	  return EmpConstant.VIEW_LOGINPAGE;
	      }
	      modelMap.addAttribute("registraionFailed",registraionFailed );
		return EmpConstant.GET_REGISTRATION_PAGE;
		
		
	}
	
	
	@PostMapping("/authentication")
	public String authentication(int id, String password, HttpServletRequest req,
			@Value("${loginError}") String loginError, @Value("${loginSuccess}") String loginSuccess) {
		// EmployeeDAO dao = EmployeeDAOFactoryOld.getInstance(dbInteractionType);
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		String mssg = "";
		HttpSession session = null;
		if (bean == null || password.equals(bean.getPassword())) {
			session = req.getSession(true);
			session.setAttribute("msg", loginSuccess);
			return "homePage";
		} else {
			req.setAttribute("loginError", loginError);

			return EmpConstant.VIEW_LOGINPAGE;
		}

	}

	@GetMapping("/logout")
	public String invalidate(ModelMap modelMap, HttpSession session, @Value("${logoutSuccess}") String logoutSuccess) {
		session.invalidate();
		modelMap.addAttribute("logoutSuccess", logoutSuccess);
		return EmpConstant.VIEW_LOGINPAGE;

	}
}
