package com.covalense.hibernateapp.onetoone;

import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernateapp.beans.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.beans.EmployeeAdreessPKBean;
import com.covalense.hibernateapp.beans.EmployeeEducationalInfoBean;
import com.covalense.hibernateapp.beans.EmployeeEducationalInfoPKBean;
import com.covalense.hibernateapp.beans.EmployeeExperienceInfoBean;
import com.covalense.hibernateapp.beans.EmployeeExperienceInfoPKBean;
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
		
		EmployeeEducationalInfoPKBean educationalInfoPKBean1 = new EmployeeEducationalInfoPKBean();
		educationalInfoPKBean1.setEducationalType("Regular");
		educationalInfoPKBean1.setInfoBean(empInf);

		EmployeeEducationalInfoPKBean educationalInfoPKBean2 = new EmployeeEducationalInfoPKBean();
		educationalInfoPKBean2.setEducationalType("Distance");
		educationalInfoPKBean2.setInfoBean(empInf);

		EmployeeEducationalInfoBean educationalInfoBean1 = new EmployeeEducationalInfoBean();
		educationalInfoBean1.setEducationalInfoPKBean(educationalInfoPKBean1);
		educationalInfoBean1.setCollegeName("Bhabha");
		educationalInfoBean1.setUniversity("CCNUL");
		educationalInfoBean1.setLoaction("India");
		educationalInfoBean1.setPercentage(76.9);
		educationalInfoBean1.setYop(new Date(2010 - 06 - 02));

		EmployeeEducationalInfoBean educationalInfoBean2 = new EmployeeEducationalInfoBean();
		educationalInfoBean2.setEducationalInfoPKBean(educationalInfoPKBean2);
		educationalInfoBean2.setCollegeName("Sakara");
		educationalInfoBean2.setUniversity("CUR");
		educationalInfoBean2.setLoaction("India");
		educationalInfoBean2.setPercentage(76.9);
		educationalInfoBean2.setYop(new Date(2014 - 06 - 12));

		EmployeeExperienceInfoPKBean experienceInfoPKBean1 = new EmployeeExperienceInfoPKBean();
		experienceInfoPKBean1.setCompanyName("ABCDF");
		experienceInfoPKBean1.setInfoBean(empInf);

		EmployeeExperienceInfoPKBean experienceInfoPKBean2 = new EmployeeExperienceInfoPKBean();
		experienceInfoPKBean2.setCompanyName("PQRST");
		experienceInfoPKBean2.setInfoBean(empInf);

		EmployeeExperienceInfoBean experienceInfoBean1 = new EmployeeExperienceInfoBean();
		experienceInfoBean1.setExperienceInfoPKBean(experienceInfoPKBean1);
		experienceInfoBean1.setDesignation("SoftwareEngineer");
		experienceInfoBean1.setJoiningDate(new Date(2016 - 06 - 12));
		experienceInfoBean1.setJoiningDate(new Date(2017 - 03 - 12));

		EmployeeExperienceInfoBean experienceInfoBean2 = new EmployeeExperienceInfoBean();
		experienceInfoBean2.setExperienceInfoPKBean(experienceInfoPKBean2);
		experienceInfoBean2.setDesignation("Testing Engineer");
		experienceInfoBean2.setJoiningDate(new Date(2015 - 06 - 12));
		experienceInfoBean2.setJoiningDate(new Date(2019 - 03 - 12));
		
		//empInf.setEmployeeExperienceInfoBean(Arrays.asList(experienceInfoBean1,experienceInfoBean2));
		empInf.setEmployeeEducationalInfoBeans(Arrays.asList(educationalInfoBean1,educationalInfoBean2));
		
		empInf.setAddressInfoBeans(Arrays.asList(addressInfoBean1,addressInfoBean2));

		empInf.setEmployeeOtherInfoBean(otherInfoBean);
		
		HibernateImpl impl = new HibernateImpl();
		impl.createEmployee(empInf);

	}

}
