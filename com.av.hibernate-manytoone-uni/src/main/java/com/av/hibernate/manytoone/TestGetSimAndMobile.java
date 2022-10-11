package com.av.hibernate.manytoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestGetSimAndMobile {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	Sim s=entityManager.find(Sim.class, 1);
	if(s!=null)
	{
		
		
		
		System.out.println("Sim id:"+s.getId());
		System.out.println("Sim service provider:"+s.getsP());
		System.out.println("Sim type:"+s.getType());
		System.out.println("---------------------------------------------------");
	}
		
	Mobile mobile1=s.getMobile();
	if(mobile1!=null)
	{
		
		System.out.println("Mobile id:"+mobile1.getId());
		System.out.println("Mobile name:"+mobile1.getName());
		System.out.println("Mobile brand:"+mobile1.getBrand());
		System.out.println("---------------------------------------------------");
	}
	}
}