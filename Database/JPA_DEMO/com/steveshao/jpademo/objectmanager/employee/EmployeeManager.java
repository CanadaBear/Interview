package com.steveshao.jpademo.objectmanager.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeManager {
	private EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA_DEMO" );
	
	public EntityManagerFactory getEmployeeFactory() {
		  return emfactory;
	}
	
	public void closeEmployeeFactory(EntityManagerFactory emfactory) {
		emfactory.close();
	}
	
	public EntityManager getEmployeeManager(EntityManagerFactory emfactory) {
		EntityManager entitymanager = emfactory.createEntityManager( );
		return entitymanager;
	}
	
	public void closeEmployeeManager(EntityManager entitymanager) {
		entitymanager.close();
	}
}
