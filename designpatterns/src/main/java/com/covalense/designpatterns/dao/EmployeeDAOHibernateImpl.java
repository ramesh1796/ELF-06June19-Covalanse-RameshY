package com.covalense.designpatterns.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpatterns.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {

		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		//1.load the config file
		Configuration configuration = new Configuration();
		configuration.configure();
		//configuration.configure("MyHibernateConfigFile.xml");
		
		/*
		 * try { configuration.configure(new URL(
		 * "https://raw.githubusercontent.com/ramesh1796/ELF-06June19-Covalanse-RameshY/master/MyHibernateConfigFile.xml"
		 * )); } catch (HibernateException e) { e.printStackTrace(); } catch
		 * (MalformedURLException e) { e.printStackTrace(); }
		 */
		configuration.addAnnotatedClass(EmployeeInfoBean.class);
		//2.Build the sessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//3.Open the session
		Session session = sessionFactory.openSession();
		//4. Interact with DB via session
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class,id);
		//5. Close the session
		session.close();
		return bean;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
