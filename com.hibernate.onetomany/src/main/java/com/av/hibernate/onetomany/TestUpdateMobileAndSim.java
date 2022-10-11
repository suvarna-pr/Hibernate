package com.av.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;




public class TestUpdateMobileAndSim {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Sim sim=entityManager.find(Sim.class, 4);
		sim.setsP("Newsim");
		sim.setType("Newsimty");
		
		
		Sim sim2=entityManager.find(Sim.class, 4);
		sim2.setsP("Newsim2");
		sim2.setType("Newsimty2");
		
		List<Sim> sims=new ArrayList<Sim>();
		
		sims.add(sim);
		sims.add(sim2);
		
		Mobile m=entityManager.find(Mobile.class, 4);
		m.setBrand("MI");
		m.setName("A10");
		
		entityTransaction.begin();
		entityManager.merge(m);
		entityManager.merge(sim);
		entityManager.merge(sim2);
		entityTransaction.commit();
		System.out.println(" Updated");
		
		


	}

}
