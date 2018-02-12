package com.steveshao.jpademo.service;

import java.util.Collection;

import com.steveshao.jpademo.objectmanager.employee.EmployeeManagerContext;
import com.steveshao.jpademo.entity.Employee;

public class EmployeeService {
	
	private EmployeeManagerContext employeeManagerContext =  new EmployeeManagerContext();
	
	public void createEmployee(Employee employee) {
		employeeManagerContext.save(employee);
	}
	
	public void updateEmployee(Employee employee) {
		employeeManagerContext.update(employee);
	}
	
	public void deleteEmployee(int eid) {
		employeeManagerContext.delete(eid);
	}
	
	public void findEmployee(int eid) {
		employeeManagerContext.find(eid);
	}
	
	public Collection<Employee> getAllEmployee() {
		return employeeManagerContext.getAllEmployees();
	}
	

}
