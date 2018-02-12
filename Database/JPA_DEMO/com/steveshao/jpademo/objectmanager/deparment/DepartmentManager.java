package com.steveshao.jpademo.objectmanager.deparment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DepartmentManager {
	private EntityManagerFactory defactory = Persistence.createEntityManagerFactory( "JPA_DEMO" );
	
	public EntityManagerFactory getDepartmentFactory() {
		  return defactory;
	}
	
	public void closeDepartmentFactory(EntityManagerFactory defactory) {
		defactory.close();
	}
	
	public EntityManager getDepartmentManager(EntityManagerFactory defactory) {
		EntityManager entitymanager = defactory.createEntityManager( );
		return entitymanager;
	}
	
	public void closeDepartmentManager(EntityManager entitymanager) {
		entitymanager.close();
	}
}
