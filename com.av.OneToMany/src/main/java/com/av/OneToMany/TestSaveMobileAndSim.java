package com.av.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobileAndSim {

	public static void main(String[] args) {
		Sim sim1=new Sim();
		sim1.setsP("bsnl");
		sim1.setType("3G");
		
		Sim sim2=new Sim();
		sim2.setsP("Jio");
		sim2.setType("4G");
		
		List<Sim> list=new ArrayList<Sim>();
		list.add(sim1);
		list.add(sim2);
		
		Mobile mobile=new Mobile();
		mobile.setName("Vivo");
		mobile.setBrand("F15");
		
		mobile.setSims(list);
		
		sim1.setMobile(mobile);
		sim2.setMobile(mobile);
		
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
