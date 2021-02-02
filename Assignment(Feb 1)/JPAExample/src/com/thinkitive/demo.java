package com.thinkitive;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class demo {
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myemp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		Employee e = new Employee(1, "Reshi", "1000");
		tx.begin();
		manager.persist(e);
		tx.commit();
		manager.close();
		
	}

}
