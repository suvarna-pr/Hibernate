package com.hibernate_manytomany_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestDeleteTeacherAndSubject {

	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Teacher t=entityManager.find(Teacher.class, 1);
	entityTransaction.begin();
	entityManager.remove(t);
	entityTransaction.commit();
	System.out.println("Teacher data deleted");

	}
}
