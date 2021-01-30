package com.thinkitive;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class DBConnection {
	
	public String addMeaning(String word) 
	{
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Dictionary.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Dictionary d = new Dictionary("Happy", "When someone is overjoyed that feeling is happinees");
		
		session.save(d);

		tx.commit();
		session.close();
		
		return word;
		
	}
	public String SearchMeaning(String word) 
	{
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Dictionary.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		Criteria c = session.createCriteria(Dictionary.class);
		c.add(Restrictions.eqOrIsNull("word", word));
		List l = c.list();
		String a= l.toString();
		

		tx.commit();
		session.close();
		
		return a;
		
	}

}
