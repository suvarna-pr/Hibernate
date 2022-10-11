package com.av.hibernate_manytomany_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestSaveTeacherAndSubject {
public static void main(String[] args) {
	

	
		Subject s1=new Subject();
		s1.setSubName("Advanced C");
		s1.setDuration(5);
		
		Subject s2=new Subject();
		s2.setSubName("Advanced C++");
		s2.setDuration(7);
		
		Subject s3=new Subject();
		s3.setSubName(" Advanced Java ");
		s3.setDuration(3);
		
		List<Subject>list1=new ArrayList<Subject>();
		list1.add(s1);
		list1.add(s2);
		//list1.add(s3);
		
		
		Teacher t1=new Teacher();
		t1.setName("Ram");
		t1.setSalary("20000");
		t1.setSubjects(list1);
		
		List<Subject> list2=new ArrayList<Subject>();
		list2.add(s2);
		list2.add(s3);
	
		
		Teacher t2=new Teacher();
		t2.setName("Suma");
		t2.setSalary("30000");
		t2.setSubjects(list2);
		
		List<Teacher> list3=new ArrayList<Teacher>();
		list3.add(t1);
		list3.add(t2);
		
		
		List<Teacher> list4=new ArrayList<Teacher>();
		list4.add(t1);
		
		List<Teacher> list5=new ArrayList<Teacher>();
		list5.add(t2);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityManager.persist(t1);
		entityManager.persist(t2);
		entityTransaction.commit();
	

}

}
