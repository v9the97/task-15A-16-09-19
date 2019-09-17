package com.wp.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

	public static void main(String[] args) {


				Employee e3=new Employee(102,"Shivam",700);
				
				
				
				Configuration config=new Configuration().configure();
				SessionFactory sf=config.buildSessionFactory();
				Session session=sf.openSession();
				Transaction tr=session.beginTransaction();

				session.delete(e3);
				
				tr.commit();
				
				session.close();
				
				System.out.println("Data Deleted");
				
				
				
				

			}

}


