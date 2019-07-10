 package com.covalense.hibernate.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class PrepareDataUtil {
	private PrepareDataUtil() {}
	
	public static EmployeeInfoBean prepareData(int id){
		EmployeeInfoBean empBean= new EmployeeInfoBean();
		empBean.setId(id);
		empBean.setName("Mikesh");
		empBean.setAge(34);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse("2012-09-07");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		empBean.setDob(date);
		empBean.setEmail("hshhd@gmail.com");
		empBean.setPassword("yes5566");
		empBean.setManagerId(1111);
		empBean.setDepartmentId(90);
		EmployeeOtherInfoBean empOtherInf= new EmployeeOtherInfoBean();
		//empOtherInf.setId(id);
		empOtherInf.setPan("ABHD987Y");
		empOtherInf.setMarried(false);
		empOtherInf.setBloodGrp("B+");
		empOtherInf.setChallenged(false);
		empOtherInf.setEmergencyContactNumber(888875501);
		empOtherInf.setEmergencyContactName("Moshon");
		empOtherInf.setNationality("India");
		empOtherInf.setReligion("Hindu");
		empOtherInf.setFatherNm("Kunal");
		empOtherInf.setMotherNm("Awani");
		empOtherInf.setSpouseNm("Sonia");
		empOtherInf.setPassport("89094885973");
		empOtherInf.setAdhaar(900848859);
		
		//empBean.setOtherInfo(empOtherInf);
		return empBean;
		
		
		
	}

}
