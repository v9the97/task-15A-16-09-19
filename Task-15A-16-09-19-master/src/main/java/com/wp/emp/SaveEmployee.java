package com.wp.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {

	public static void main(String[] args) {
		
		Employee e1=new Employee(100,"Manav",500);
		Employee e2=new Employee(101,"Sunny",600);
		Employee e3=new Employee(102,"Shivam",700);
		
		
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		tr.commit();
		
		session.close();
		
		System.out.println("Data Stored");
		
		
		
		

	}

}
