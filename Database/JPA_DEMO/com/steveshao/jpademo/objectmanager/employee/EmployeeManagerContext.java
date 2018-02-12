package com.steveshao.jpademo.objectmanager.employee;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.steveshao.jpademo.entity.Employee;

public class EmployeeManagerContext {
	
	private EmployeeManager employeeManager =  new EmployeeManager();
	
	public void save(Employee employee) {
		EntityManagerFactory emfactory =  employeeManager.getEmployeeFactory();
		EntityManager entitymanager = employeeManager.getEmployeeManager(emfactory);
		 
		entitymanager.getTransaction( ).begin( );
		entitymanager.persist(employee);
		entitymanager.getTransaction().commit( );
		  
		employeeManager.closeEmployeeManager(entitymanager);;
		employeeManager.closeEmployeeFactory(emfactory);
	}
	
	public void update(Employee newEmployee) {
		EntityManagerFactory emfactory =  employeeManager.getEmployeeFactory();
		EntityManager entitymanager = employeeManager.getEmployeeManager(emfactory);
		 
		entitymanager.getTransaction( ).begin( );
		Employee employee = entitymanager.find(Employee.class, newEmployee.geteId());
		employee.setDeg(newEmployee.getDeg());
		employee.seteName(newEmployee.geteName());
		employee.setSalary(newEmployee.getSalary());
		entitymanager.getTransaction().commit( );
		  
		employeeManager.closeEmployeeManager(entitymanager);;
		employeeManager.closeEmployeeFactory(emfactory);
	}
	
	public Employee find(int eid) {
		EntityManagerFactory emfactory =  employeeManager.getEmployeeFactory();
		EntityManager entitymanager = employeeManager.getEmployeeManager(emfactory);
		 
		entitymanager.getTransaction( ).begin( );
		Employee employee = entitymanager.find(Employee.class, eid);
		  
		employeeManager.closeEmployeeManager(entitymanager);;
		employeeManager.closeEmployeeFactory(emfactory);
		
		return employee;
	}
	
	public void delete(int eid) {
		EntityManagerFactory emfactory =  employeeManager.getEmployeeFactory();
		EntityManager entitymanager = employeeManager.getEmployeeManager(emfactory);
		 
		entitymanager.getTransaction( ).begin( );
		Employee employee = entitymanager.find(Employee.class, eid);
		entitymanager.remove(employee);
	    entitymanager.getTransaction( ).commit( );  
		
	    employeeManager.closeEmployeeManager(entitymanager);;
		employeeManager.closeEmployeeFactory(emfactory);
	}
	
	@SuppressWarnings("unchecked")
	public Collection<Employee> getAllEmployees() {
		EntityManagerFactory emfactory =  employeeManager.getEmployeeFactory();
		EntityManager entitymanager = employeeManager.getEmployeeManager(emfactory);
		 
		entitymanager.getTransaction( ).begin( );
		//Query query = entitymanager.createQuery("Select e from Employee e ");
		Query query = entitymanager.createNamedQuery("find all employees");
		Collection<Employee> employees = query.getResultList();
	    entitymanager.getTransaction( ).commit( );  
		
	    employeeManager.closeEmployeeManager(entitymanager);;
		employeeManager.closeEmployeeFactory(emfactory);
		return employees;
	}
}
