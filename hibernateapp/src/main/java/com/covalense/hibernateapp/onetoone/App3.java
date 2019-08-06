package com.covalense.hibernateapp.onetoone;

import java.util.Arrays;

import com.covalense.hibernateapp.beans.EmployeeInfoBean;
import com.covalense.hibernateapp.beans.TrainingInfoBean;

public class App3 {

	public static void main(String[] args) {

		 HibernateImpl impl = new HibernateImpl();
		 EmployeeInfoBean infoBean1 = impl.getEmployeeInfoBean(2);
		 EmployeeInfoBean infoBean2 = impl.getEmployeeInfoBean(3);
		  
		 TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		 trainingInfoBean.setCourseId(100);
		 trainingInfoBean.setCourseType("Regular");
		 trainingInfoBean.setCourseName("Python");
		 trainingInfoBean.setDuration(3);
		 trainingInfoBean.setInfoBeans(Arrays.asList(infoBean1,infoBean2));
		 impl.createTraining(trainingInfoBean);
		
	}

	}


