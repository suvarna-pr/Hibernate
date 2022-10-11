package com.hibernate_manytomany_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import net.bytebuddy.implementation.bytecode.Addition;


public class TestUpdateTeacherAndSubject {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Teacher t1=entityManager.find(Teacher.class,2);
		t1.setName("Anu");
		t1.setSalary("20000");
		List<Subject> subject=t1.subject
		
		
		Subject s=entityManager.find(Subject.class, 4);
		s.setSubName("English");
		s.setDuration(6);
		
		
		Subject s1=entityManager.find(Subject.class, 5);
		s1.setSubName("Hindi");
		s1.setDuration(2);
		
		List<Subject> sub=new ArrayList<Subject>();
		
		sub.add(s);
		sub.add(s1);

		entityTransaction.begin();
		entityManager.merge(t);
		entityManager.merge(s);
		entityManager.merge(s1);
		entityTransaction.commit();
		System.out.println(" Updated");
		
		
	}

}
