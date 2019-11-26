package com.wp.emp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int eno;
	private String ename;
	private int esal;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	
	public Employee(int eno, String ename, int esal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	// making a new branch so that it avaliable to commit and merging
	//deletion code only for testing it's not going to work so make commment below the code for the successful comlption of the code , do it now 
	// code should have a proper comment on this line of code
	
	Configuration config=new Configuration().configure();
				SessionFactory sf=config.buildSessionFactory();
				Session session=sf.openSession();
				Transaction tr=session.beginTransaction();

				session.delete(e3);
				
				tr.commit();
				
				session.close();
				
				System.out.println("Data Deleted");
	
}
