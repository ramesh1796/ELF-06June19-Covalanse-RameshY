package com.covalense.designpatterns.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.covalense.designpatterns.util.HibernateUtil;

public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {

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
		// SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		// 3.Open the session
		Session session = HibernateUtil.openSeesion();
		// 4. Interact with DB via session
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		// 5. Close the session
		session.close();
		return bean;
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = HibernateUtil.openSeesion();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {

		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		try {
			Session session = HibernateUtil.openSeesion();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
