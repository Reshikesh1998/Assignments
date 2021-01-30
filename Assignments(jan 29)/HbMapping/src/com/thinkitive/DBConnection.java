package com.thinkitive;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class DBConnection {
	
	public void addMeaning() 
	{
		
		Configuration cfg = new Configuration();
	
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		Address address = new Address(22,"pune");
		
		Employee e = new Employee("rks", 3,23000,address);
		
		session.save(e);

		tx.commit();
		session.close();
		
		
		
	}

	}


