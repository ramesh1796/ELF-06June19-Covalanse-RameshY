package com.covalense.emp.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.util.HibernateUtilOld;

import lombok.extern.java.Log;
@Log
public class EmployeeDAOHibernateImplOld {
	/*
	 * @Override public List<EmployeeInfoBean> getAllEmployeeInfo() {
	 * 
	 * Session session = HibernateUtil.openSeesion();
	 * 
	 * String hql = "from EmployeeInfoBean"; Query query = session.createQuery(hql);
	 * List<EmployeeInfoBean> empl = query.list(); session.close(); return empl;
	 * 
	 * }
	 * 
	 * @Override public EmployeeInfoBean getEmployeeInfo(String id) {
	 * 
	 * return getEmployeeInfo(Integer.parseInt(id)); }
	 * 
	 * @Override public EmployeeInfoBean getEmployeeInfo(int id) { // SessionFactory
	 * sessionFactory = HibernateUtil.buildSessionFactory(); // 3.Open the session
	 * Session session = HibernateUtil.openSeesion(); // 4. Interact with DB via
	 * session EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id); //
	 * 5. Close the session session.close(); return bean; }
	 * 
	 * private boolean saveOrUpdate(EmployeeInfoBean bean) { Transaction txn = null;
	 * try { Session session = HibernateUtil.openSeesion(); txn =
	 * session.beginTransaction(); session.saveOrUpdate(bean); txn.commit(); return
	 * true; } catch (Exception e) { log.severe(Arrays.toString(e.getStackTrace()));
	 * if(txn!=null) { txn.rollback(); } return false; }
	 * 
	 * }
	 * 
	 * @Override public boolean createEmployeeInfo(EmployeeInfoBean bean) {
	 * 
	 * return saveOrUpdate(bean); }
	 * 
	 * @Override public boolean updateEmployeeInfo(EmployeeInfoBean bean) { return
	 * saveOrUpdate(bean); }
	 * 
	 * @Override public boolean deleteEmployeeInfo(int id) { Transaction txn = null;
	 * EmployeeInfoBean bean = new EmployeeInfoBean(); bean.setId(id); try { Session
	 * session = HibernateUtil.openSeesion(); txn = session.beginTransaction();
	 * session.delete(bean); txn.commit(); return true; } catch (Exception e) {
	 * txn.rollback(); e.printStackTrace(); return false; }
	 * 
	 * }
	 * 
	 * @Override public boolean deleteEmployeeInfo(String id) {
	 * 
	 * return deleteEmployeeInfo(Integer.parseInt(id)); }
	 * 
	 * @Override public List<EmployeeInfoBean> searchById(String id) { Session
	 * session = HibernateUtil.openSeesion(); String hql =
	 * "from EmployeeInfoBean where id like '" +id+ "%'"; Query query =
	 * session.createQuery(hql); List<EmployeeInfoBean> empl = query.list();
	 * session.close(); return empl; }
	 */
}
