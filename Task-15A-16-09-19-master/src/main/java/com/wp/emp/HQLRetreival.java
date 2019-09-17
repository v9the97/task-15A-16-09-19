package com.wp.emp;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HQLRetreival {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();

		
		String queryString="select esal,ename from Employee where esal> :sal order by esal ";
		Query query = session.createQuery(queryString);
		query.setParameter("sal",500);
		
        @SuppressWarnings("rawtypes")
		List<Employee> list = query.getResultList();
        
        Iterator it2 = list.iterator();

		while (it2.hasNext()) {
			Object[] obj = (Object[]) it2.next();
			System.out.println("salary : " + obj[0] + " empName : " + obj[1]);
		}


	}

}
