package com.thinkitive;

import java.util.ArrayList;
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
		Address a1= new Address(123,"pune");
		Address a2 = new Address(231,"nashik");
		Address a3 = new Address(312,"jalgaon");
		Address a4 = new Address(111,"mumbai");
		Address a5 = new Address(222,"panji");
		
		List<Address>address = new ArrayList<Address>();
		List<Address>address1 = new ArrayList<Address>();
		address.add(a1);
		address.add(a2);
		address.add(a3);
		address1.add(a4);
		address1.add(a5);
		
 		Employee e = new Employee("rkd", 101,23000,address);
 		Employee e1 = new Employee("krd", 303,23000,address1);
		
		session.save(e);
		session.save(e1);

		tx.commit();
		session.close();
		
		
		
	}

	}


