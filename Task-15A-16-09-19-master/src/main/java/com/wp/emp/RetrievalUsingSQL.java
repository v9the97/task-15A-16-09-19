package com.wp.emp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetrievalUsingSQL {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();

	
		
		SQLQuery query = session.createSQLQuery("select eno,ename,esal from Employee");
		query.addEntity(Employee.class);
		
		List<Employee> Employees=query.list();
		for(Employee e:Employees){
			System.out.println(e);
		}
		
	}

}
