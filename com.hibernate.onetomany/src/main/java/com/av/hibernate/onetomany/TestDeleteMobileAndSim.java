package com.av.hibernate.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class TestDeleteMobileAndSim {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Mobile m=entityManager.find(Mobile.class, 5);
		entityTransaction.begin();
		entityManager.remove(m);
		entityTransaction.commit();
		System.out.println("Mobile data deleted");
		}
	}
