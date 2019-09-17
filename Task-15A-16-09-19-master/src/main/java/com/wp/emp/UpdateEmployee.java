package com.wp.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

	public static void main(String[] args) {

		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		
		//Using QBI (Query By Id)
		
		Employee e=session.get(Employee.class,101);
		
		e.setEname("Shivam");

		session.update(e);
		
		tr.commit();
		
		session.close();
		
		System.out.println("Data Updated");
		
		
		
	}

}
