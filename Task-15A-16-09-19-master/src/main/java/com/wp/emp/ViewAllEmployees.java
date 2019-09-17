package com.wp.emp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ViewAllEmployees {

	public static void main(String[] args) {

		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();


		@SuppressWarnings("deprecation")

		Criteria cr = session.createCriteria(Employee.class);

		ProjectionList plist = Projections.projectionList();

		Projection projection = Projections.property("esal");
		Projection projection1 = Projections.property("ename");
		plist.add(projection);
		plist.add(projection1);
		cr.setProjection(plist);

		Criterion cr1 = Restrictions.ilike("ename", "M%");
		Criterion cr2 = Restrictions.gt("esal", 1200);
		Criterion cr3 = Restrictions.or(cr1, cr2);
		cr.add(cr1);
		cr.add(cr2);
		cr.add(cr3);
		cr.addOrder(Order.asc("esal"));

		List list = cr.list();

		Iterator it2 = list.iterator();

		while (it2.hasNext()) {
			Object[] obj = (Object[]) it2.next();
			System.out.println("Salary : " + obj[0] + " empName : " + obj[1]);
		}

		session.close();

	}

}
