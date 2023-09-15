package com.jsp.vehicle.registration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VehicleSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nish");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Registration registration = new Registration();
		registration.setReg_no("MH01BX3357");
		registration.setCity("Mumbai");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setBrand("Hyundai");
		vehicle.setModel("i20");
		vehicle.setColor("white");
		vehicle.setPrice(1100000);
		
		vehicle.setRegistration(registration);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(registration);
		entityTransaction.commit();
	}
}
