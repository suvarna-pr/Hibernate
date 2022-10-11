package com.av.hibernate.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class TestGetAllMobileAndSim {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Query q= entityManager.createQuery("select m from Mobile m");
		List<Mobile> mobiles=q.getResultList();
		for(Mobile mobile:mobiles)
		{
			System.out.println("Mobile id:"+mobile.getId());
			System.out.println("Mobile name:"+mobile.getName());
			System.out.println("Mobile brand:"+mobile.getBrand());
			System.out.println("---------------------------------------------------");
			
			
			List<Sim> sim1=mobile.getS();
			for(Sim sim:sim1)
			{
				System.out.println("Sim id:"+sim.getId());
				System.out.println("Sim service provider:"+sim.getsP());
				System.out.println("Sim type:"+sim.getType());
				System.out.println("---------------------------------------------------");
				
			}

		}
		
	}

}
