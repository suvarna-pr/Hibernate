package com.hibernate_manytomany_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;





public class TestGetAllTeacherAndSubject {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jeevitha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Query query=entityManager.createQuery("Select t from Teacher t ");
		List<Teacher> tea=query.getResultList();
		
		for(Teacher t:tea)
		{
			System.out.println("Teacher id:"+t.getId());
			System.out.println("Teacher name:"+t.getName());
			System.out.println("Teacher salary:"+t.getSalary());
			System.out.println("---------------------------------------------------");
			
			List<Subject> subject=t.getSubjects();
				for(Subject s:subject)
						
			{
				System.out.println("Subject id:"+s.getId());
				System.out.println("Subject name:"+s.getSubName());
				System.out.println("Subject duration:"+s.getDuration());
				System.out.println("---------------------------------------------------");
			}
		}
	}

}
