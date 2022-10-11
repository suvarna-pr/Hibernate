package com.av.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobileSim {

	public static void main(String[] args) {
		Sim sim1=new Sim();
		sim1.setsP("bsnl");
		sim1.setType("3G");
		
		Sim sim2=new Sim();
		sim2.setsP("jio");
		sim2.setType("4G");
		
		List<Sim> list=new ArrayList<Sim>();
		list.add(sim1);
		list.add(sim2);
		
		Mobile mobile=new Mobile();
		mobile.setName("vivo");
		mobile.setBrand("F15");
		
		mobile.setS(list);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityManager.persist(mobile);
		entityTransaction.commit();
		
		
	}

}
