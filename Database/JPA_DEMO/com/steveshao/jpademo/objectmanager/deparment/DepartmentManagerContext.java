package com.steveshao.jpademo.objectmanager.deparment;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.steveshao.jpademo.entity.Department;

public class DepartmentManagerContext {
	
	private DepartmentManager departmentManager =  new DepartmentManager();
	
	public void save(Department deparment) {
		EntityManagerFactory emfactory =  departmentManager.getDepartmentFactory();
		EntityManager entitymanager = departmentManager.getDepartmentManager(emfactory);
		 
		entitymanager.getTransaction( ).begin( );
		entitymanager.persist(deparment);
		entitymanager.getTransaction().commit( );
		  
		departmentManager.closeDepartmentManager(entitymanager);;
		departmentManager.closeDepartmentFactory(emfactory);
	}
	
	public void update(Department newdeparment) {
		EntityManagerFactory emfactory =  departmentManager.getDepartmentFactory();
		EntityManager entitymanager = departmentManager.getDepartmentManager(emfactory);
		 
		entitymanager.getTransaction( ).begin( );
		Department deparment = entitymanager.find(Department.class, newdeparment.getId());
		deparment.setName(newdeparment.getName());
		entitymanager.getTransaction().commit( );
		  
		departmentManager.closeDepartmentManager(entitymanager);;
		departmentManager.closeDepartmentFactory(emfactory);
	}
	
	public Department find(int id) {
		EntityManagerFactory emfactory =  departmentManager.getDepartmentFactory();
		EntityManager entitymanager = departmentManager.getDepartmentManager(emfactory);
			 
		entitymanager.getTransaction( ).begin( );
		Department deparment = entitymanager.find(Department.class, id);
		  
		departmentManager.closeDepartmentManager(entitymanager);;
		departmentManager.closeDepartmentFactory(emfactory);
		
		return deparment;
	}
	
	public void delete(int id) {
		EntityManagerFactory emfactory =  departmentManager.getDepartmentFactory();
		EntityManager entitymanager = departmentManager.getDepartmentManager(emfactory);
			 
		entitymanager.getTransaction( ).begin( );
		Department deparment = entitymanager.find(Department.class, id);
		entitymanager.remove(deparment);
	    entitymanager.getTransaction( ).commit( );  
		
		departmentManager.closeDepartmentManager(entitymanager);;
		departmentManager.closeDepartmentFactory(emfactory);
	}
	
	@SuppressWarnings("unchecked")
	public Collection<Department> getAllDepartments() {
		EntityManagerFactory emfactory =  departmentManager.getDepartmentFactory();
		EntityManager entitymanager = departmentManager.getDepartmentManager(emfactory);
			 
		entitymanager.getTransaction( ).begin( );
		//Query query = entitymanager.createQuery("Select e from Employee e ");
		Query query = entitymanager.createNamedQuery("find all departments");
		Collection<Department> deparments = query.getResultList();
	    entitymanager.getTransaction( ).commit( );  
		
		departmentManager.closeDepartmentManager(entitymanager);;
		departmentManager.closeDepartmentFactory(emfactory);
		return deparments;
	}
}

