package com.covalense.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernateapp.beans.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log

public class GetDetailsProjection {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection pro = Projections.property("name");
		Projection pro2 = Projections.property("id");
		Projection pro3 = Projections.property("email");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(pro);
		projectionList.add(pro2);
		projectionList.add(pro3);
		criteria.setProjection(projectionList);
		List<Object[]> obj = criteria.list();
		for(Object[] empls: obj) {
			log.info("Name:- "+empls[0]);
			log.info("ID:- "+empls[1]);
			log.info("ID:- "+empls[2]);
	}
}
}