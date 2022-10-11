package com.av.OneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestDeleteMobileAndSim {
	public static void main(String[] args) {
	
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Mobile m=entityManager.find(Mobile.class, 2);
		List<Sim> sims=m.getSims();
		
		entityTransaction.begin();
		for(Sim s:sims)
		{
			entityManager.remove(s);
		}
		entityManager.remove(m);
		entityTransaction.commit();
		System.out.println("Mobile and Sim data deleted");

	}

}
