package com.thinkitive;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class DBConnection {
	
	
	public List SearchEmployee(String value) 
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Criteria c = session.createCriteria(Employee.class);
		c.add(Restrictions.eqOrIsNull("ename", value));
		List l = c.list();
		
		return l;
		
	}

	public void AddAddress(int pincode, String address ) 
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Address.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Address e = new Address(pincode, address);
		session.save(e);

		tx.commit();
		session.close();
		
		
		
	}

}
