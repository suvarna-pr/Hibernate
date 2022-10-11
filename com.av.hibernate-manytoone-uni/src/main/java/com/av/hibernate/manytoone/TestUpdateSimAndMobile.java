package com.av.hibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TestUpdateSimAndMobile {

	

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Mobile m=entityManager.find(Mobile.class, 3);
		m.setBrand("MI");
		m.setName("A10");
		
		
		Sim sim=entityManager.find(Sim.class, 3);
		sim.setsP("Vodaphone");
		sim.setType("3G");
		
		Sim sim2=entityManager.find(Sim.class, 2);
		sim2.setsP("Idea");
		sim2.setType("2G");
		
		entityTransaction.begin();
		entityManager.merge(m); //UPDATE
		entityManager.merge(sim);
		entityManager.merge(sim2);
		entityTransaction.commit();
		System.out.println(" Updated");

	}

}
