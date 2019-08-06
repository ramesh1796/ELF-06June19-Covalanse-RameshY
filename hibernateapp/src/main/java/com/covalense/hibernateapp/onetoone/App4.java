package com.covalense.hibernateapp.onetoone;

import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernateapp.beans.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.beans.EmployeeAdreessPKBean;
import com.covalense.hibernateapp.beans.EmployeeInfoBean;
import com.covalense.hibernateapp.beans.EmployeeOtherInfoBean;

public class App4 {

	public static void main(String[] args) {

		EmployeeInfoBean empInf = new EmployeeInfoBean();
		empInf.setId(852);
		empInf.setName("Vaishali");
		empInf.setAge(28);
		empInf.setGender("Female");
		empInf.setSalary(19330);
		empInf.setPhone(80099075501L);
		empInf.setJoiningDate(new Date(2110 - 10 - 20));
		empInf.setAccountNumber(255225854);
		empInf.setEmail("nllest@gmail.com");
		empInf.setDesigtnation("JEE");
		empInf.setDob(new Date(1950 - 06 - 06));
		empInf.setPassword("vaishali123");

		EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
		otherInfoBean.setAdhaar(35364647);
		otherInfoBean.setPan("H685YJ8");
		otherInfoBean.setBloodGrp("B+");
		otherInfoBean.setChallenged(false);
		otherInfoBean.setEmergencyContactName("Mahima");
		otherInfoBean.setMarried(true);
		otherInfoBean.setNationality("India");
		otherInfoBean.setMotherNm("Mina");
		otherInfoBean.setFatherNm("Dhram");
		otherInfoBean.setSpouseNm("Naveen");
		otherInfoBean.setEmergencyContactNumber(9878575);
		otherInfoBean.setReligion("Hindu");
		
		otherInfoBean.setInfoBean(empInf);
		EmployeeAdreessPKBean adreessPKBean1= new EmployeeAdreessPKBean();
		adreessPKBean1.setAddressType("T");
		adreessPKBean1.setInfoBean(empInf);
		EmployeeAdreessPKBean adreessPKBean2= new EmployeeAdreessPKBean();
		adreessPKBean2.setAddressType("P");
		adreessPKBean2.setInfoBean(empInf);
		
		EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		addressInfoBean1.setAddressPKBean(adreessPKBean1);
		addressInfoBean1.setAddress1("HN119");
		addressInfoBean1.setAddress2("BTM");
		addressInfoBean1.setCity("Bangalore");
		addressInfoBean1.setLandmark("Manjunath");
		
		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setAddressPKBean(adreessPKBean2);
		addressInfoBean2.setAddress1("HN11");
		addressInfoBean2.setAddress2("BTM-2");
		addressInfoBean2.setCity("Bangalore");
		addressInfoBean2.setLandmark("Manjunaa");
		
		empInf.setAddressInfoBeans(Arrays.asList(addressInfoBean1,addressInfoBean2));

		empInf.setEmployeeOtherInfoBean(otherInfoBean);
		
		HibernateImpl impl = new HibernateImpl();
		impl.createEmployee(empInf);

	}

}
