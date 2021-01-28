package com.thinkitive;

import java.awt.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyDbConnection {
	Configuration cfg ;
	SessionFactory factory;
	Session session;
	Transaction tx;
	public MyDbConnection() {
		cfg=  new Configuration();
		factory = cfg.configure().buildSessionFactory();
		
		
	}
	
	public void  InsertEmployee(int id, String name, int sal) 
	{
		Employee e = new Employee(id, name, sal);
		session = factory.openSession();
		tx = session.beginTransaction();
		session.save(e);


		tx.commit();
		session.close();
	
		
		
	}
	public void updateEmployee(int id, String name, int sal) 
	{
		Employee e = new Employee(id, name, sal);
		session = factory.openSession();
		tx = session.beginTransaction();
		session.update(e);


		tx.commit();
		session.close();
		
	}
	
	public void deleteEmployee(int id, String name, int sal) 
	{
		Employee e = new Employee(id, name, sal);
		session = factory.openSession();
		tx = session.beginTransaction();
		session.delete(e);


		tx.commit();
		session.close();
		
	}
	public void displayEmployee() 
	{
	
		session = factory.openSession();
		tx = session.beginTransaction();
		Query q = session.createQuery("From Employee");
		java.util.List l = q.list();
		System.out.println(l);
		

		tx.commit();
		session.close();
		
	}
	
	
	

}
