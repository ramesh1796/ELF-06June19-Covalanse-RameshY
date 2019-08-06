package com.covalense.hibernateapp.onetoone;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernate.util.PrepareDataUtil;
import com.covalense.hibernateapp.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {
	public static void main(String[] args) {
		
	
 //prepare data
	int id=188;
	EmployeeInfoBean data=PrepareDataUtil.prepareData(id);
	save(data);
	}
	
	private static void save(EmployeeInfoBean data) {
	Transaction txn= null;
	//save
	try(Session session = HibernateUtil.openSession()){
		txn = session.beginTransaction();
		session.save(data);
		txn.commit();	
	}//try ends
	catch(Exception ex) {
		ex.printStackTrace();
//		log.severe(Arrays.toString(ex.getStackTrace()));
		if(txn!=null) {
			txn.rollback();
		}//if ends
	}//catch block ends
	}//save ends 
}

