package com.av.OneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TestGetMobile {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Mobile mobile=entityManager.find(Mobile.class, 1);
		if(mobile!=null)
		{
			System.out.println("Mobile id:"+mobile.getId());
			System.out.println("Mobile name:"+mobile.getName());
			System.out.println("Mobile brand:"+mobile.getBrand());
			System.out.println("---------------------------------------------------");
			List<Sim> list=mobile.getSims();
			for(Sim sim:list)
			{
				System.out.println("Sim id:"+sim.getId());
				System.out.println("Sim service provider:"+sim.getsP());
				System.out.println("Sim type:"+sim.getType());
				System.out.println("---------------------------------------------------");
				
			}
		}
		

	}

}
