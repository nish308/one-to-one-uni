package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonPan {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nish");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		//to add person
		Person person = new Person();
		person.setName("Nishant");
		person.setEmail("nish@mail.com");
		person.setCno(1234567890);
		
		//to add pan
		Pan pan = new Pan();
		pan.setAddress("Mumbai");
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		
	}
}
