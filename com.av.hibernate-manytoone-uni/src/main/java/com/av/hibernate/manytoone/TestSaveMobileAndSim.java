package com.av.hibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestSaveMobileAndSim {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.setName("Y91");
		mobile.setBrand("Vivo");
		
		
		Sim sim1=new Sim();
		sim1.setsP("VI");
		sim1.setType("4G");
		
		sim1.setMobile(mobile);
		
		Sim sim2=new Sim();
		sim2.setsP("Jio");
		sim2.setType("3G");
		
		sim2.setMobile(mobile);
		
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();//START
		entityManager.persist(sim1);//INSERT
		entityManager.persist(sim2);//INSERT
		entityManager.persist(mobile);//INSERT
		entityTransaction.commit();//CLOSE

	}

}
