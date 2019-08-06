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
import com.covalense.hibernateapp.beans.TrainingInfoBean;

public class App {
	public static void main(String[] args) {

		EmployeeInfoBean empInf = new EmployeeInfoBean();
		empInf.setId(320);
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
		//empInf.setDepartmentId(822);
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

		EmployeeAdreessPKBean adreessPKBean1 = new EmployeeAdreessPKBean();
		adreessPKBean1.setAddressType("T");
		adreessPKBean1.setInfoBean(empInf);

		EmployeeAdreessPKBean adreessPKBean2 = new EmployeeAdreessPKBean();
		adreessPKBean2.setAddressType("P");
		adreessPKBean2.setInfoBean(empInf);

		EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		addressInfoBean1.setAddressPKBean(adreessPKBean1);
		addressInfoBean1.setAddress1("ABC");
		addressInfoBean1.setAddress2("BBBB");
		addressInfoBean1.setCity("Bangalore");
		addressInfoBean1.setCountry("India");
		addressInfoBean1.setPincode(455676);
		addressInfoBean1.setState("Yaman");

		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setAddressPKBean(adreessPKBean2);
		addressInfoBean2.setAddress1("XYZ");
		addressInfoBean2.setAddress2("AAAA");
		addressInfoBean2.setCity("Banaras");
		addressInfoBean2.setLandmark("Ganga");
		addressInfoBean2.setState("UP");
		addressInfoBean2.setCountry("India");
		addressInfoBean2.setPincode(453553);

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

		HibernateImpl hibernateImpl = new HibernateImpl();
		hibernateImpl.createEmployee(empInf, otherInfoBean, Arrays.asList(addressInfoBean1, addressInfoBean2),
				Arrays.asList(educationalInfoBean1, educationalInfoBean2),
				Arrays.asList(experienceInfoBean1, experienceInfoBean2));

		EmployeeInfoBean bean1 = new EmployeeInfoBean();
		bean1.setId(12);
		EmployeeInfoBean bean2 = new EmployeeInfoBean();
		bean2.setId(14);
		EmployeeInfoBean bean3 = new EmployeeInfoBean();
		bean3.setId(16);

		TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		trainingInfoBean.setCourseId(100);
		trainingInfoBean.setCourseName("java");

		trainingInfoBean.setInfoBeans(Arrays.asList(bean1, bean2, bean3));
		HibernateImpl impl = new HibernateImpl();
		impl.createTraining(trainingInfoBean);

	}

}
