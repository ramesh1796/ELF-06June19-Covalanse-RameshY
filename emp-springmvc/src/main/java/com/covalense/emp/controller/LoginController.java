package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.beans.EmployeeAddressInfoBean;
import com.covalense.emp.beans.EmployeeEducationalInfoBean;
import com.covalense.emp.beans.EmployeeExperienceInfoBean;
import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.beans.EmployeeOtherInfoBean;
import com.covalense.emp.commons.EmpConstant;
import com.covalense.emp.dao.EmployeeDAO;

@Controller
@RequestMapping("/login")
@PropertySource(EmpConstant.PROP_FILE)
public class LoginController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	@InitBinder
	public void init(WebDataBinder binder) {
		CustomDateEditor dateEditor= new  CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@GetMapping("/loginPage")
	public String getForm() {
		return EmpConstant.VIEW_LOGINPAGE;
	}
	@GetMapping("/update")
	public String getUpdateEmployee() {
		return "updateEmployee";
	}
	
	@GetMapping("/registraion")
	public String getRegistrationForm() {
		return EmpConstant.GET_REGISTRATION_PAGE;
	}
	
	
	
	@PostMapping("/updateEmployee")
	public String registrationForm(EmployeeInfoBean infoBean, ModelMap modelMap, int mgrId) {
		EmployeeInfoBean employeeInfoBean = dao.getEmployeeInfo(mgrId);
		infoBean.setManagerId(employeeInfoBean);
		dao.updateEmployeeInfo(infoBean);
		return "homePage";
		
	}
	
	@PostMapping("/registraionForm")
	public String registrationForm(EmployeeInfoBean infoBean, ModelMap modelMap,
			@Value("${registraionFailed}") String registraionFailed,
			@Value("${registraionSuccess}") String registraionSuccess) {
		
		List<EmployeeEducationalInfoBean> eduBeans = infoBean.getEmployeeEducationalInfoBeans();
		for(EmployeeEducationalInfoBean educationalInfoBean: eduBeans) {
			educationalInfoBean.getEducationalInfoPKBean().setInfoBean(infoBean);
		}
		
		List<EmployeeAddressInfoBean> addressBeans = infoBean.getAddressInfoBeans();
		for(EmployeeAddressInfoBean addressInfoBean: addressBeans) {
			addressInfoBean.getAddressPKBean().setInfoBean(infoBean);
		}
		
		List<EmployeeExperienceInfoBean> expBeans = infoBean.getExperienceInfoBeans();
		for(EmployeeExperienceInfoBean employeeExperienceInfoBean: expBeans) {
			employeeExperienceInfoBean.getExperienceInfoPKBean().setInfoBean(infoBean);
		}
		
	     EmployeeOtherInfoBean otherInfoBean = infoBean.getEmployeeOtherInfoBean();
	     otherInfoBean.setInfoBean(infoBean);
		
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
