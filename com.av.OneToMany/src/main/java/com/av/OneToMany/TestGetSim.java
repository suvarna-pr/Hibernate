package com.av.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetSim {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Sim sim=entityManager.find(Sim.class, 2);
		if(sim!=null)
		{
			System.out.println("Sim id:"+sim.getId());
			System.out.println("Sim service provider:"+sim.getsP());
			System.out.println("Sim type:"+sim.getType());
			System.out.println("---------------------------------------------------");
		}
			
			Mobile mobile=sim.getMobile();
			if(mobile!=null)
			{
				System.out.println("Mobile id:"+mobile.getId());
				System.out.println("Mobile name:"+mobile.getName());
				System.out.println("Mobile brand:"+mobile.getBrand());
				System.out.println("---------------------------------------------------");
			}
	}

}

