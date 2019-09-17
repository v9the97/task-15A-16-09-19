package com.wp.emp;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLdelete {

	public static void main(String[] args) {
		

		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr=session.beginTransaction();

		String queryString = "delete from Employee where eno= :no ";
		Query qry = session.createQuery(queryString);
		qry.setParameter("no",103);

		int res = qry.executeUpdate();
		
		tr.commit();

		System.out.println("Command successfully executed....");
		System.out.println("Numer of records effected due to delete query " + res);

		session.close();

	}

}
