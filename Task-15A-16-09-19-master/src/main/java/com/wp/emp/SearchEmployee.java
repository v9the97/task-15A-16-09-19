package com.wp.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class SearchEmployee {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Employee No");
		
		int eno=sc.nextInt();
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Employee e=session.get(Employee.class,eno);
		
		if(e!=null)
		{
			System.out.println(e.getEname());
			System.out.println(e.getEno());
			System.out.println(e.getEsal());
		}

	}

}
