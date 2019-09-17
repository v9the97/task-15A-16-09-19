package com.wp.emp;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLupdate {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr=session.beginTransaction();

		String queryString = "update Employee set esal= :sal where eno= ? ";
		Query qry = session.createQuery(queryString);
		qry.setParameter("no",101);
		qry.setParameter("sal",7000);

		int res = qry.executeUpdate();
		
		tr.commit();

		System.out.println("Command successfully executed....");
		System.out.println("Numer of records effected due to update query " + res);

		session.close();


	}

}
