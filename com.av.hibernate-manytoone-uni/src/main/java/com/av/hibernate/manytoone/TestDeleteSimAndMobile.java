package com.av.hibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteSimAndMobile {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		
		Sim sim=entityManager.find(Sim.class, 3);
		entityTransaction.begin();
		entityManager.remove(sim);//DELETE
		entityTransaction.commit();
		
		System.out.println("Sim data deleted");
		
	}

}
