package com.hibernate_manytomany_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TestGetTeacherAndSubject {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Teacher t1=entityManager.find(Teacher.class, 2);
		if(t1!=null)
		{
			System.out.println("Teacher id:"+t1.getId());
			System.out.println("Teacher name:"+t1.getName());
			System.out.println("Teacher salary:"+t1.getSalary());
			System.out.println("---------------------------------------------------");
			List<Subject> list=t1.getSubjects();
			for(Subject s:list)
			{
				System.out.println("Subject id:"+s.getId());
				System.out.println("Subject Name:"+s.getSubName());
				System.out.println("Subject Duration:"+s.getDuration());
				System.out.println("---------------------------------------------------");
				
			}
		}
	}

}
