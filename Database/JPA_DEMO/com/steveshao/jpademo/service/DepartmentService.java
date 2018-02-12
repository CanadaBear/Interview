package com.steveshao.jpademo.service;

import java.util.Collection;

import com.steveshao.jpademo.objectmanager.deparment.DepartmentManagerContext;
import com.steveshao.jpademo.entity.Department;

public class DepartmentService {
	
	private DepartmentManagerContext departmentManagerContext =  new DepartmentManagerContext();
	
	public void createDepartment(Department department) {
		departmentManagerContext.save(department);
	}
	
	public void updateDepartment(Department department) {
		departmentManagerContext.update(department);
	}
	
	public void deleteDepartment(int did) {
		departmentManagerContext.delete(did);
	}
	
	public void findDepartment(int did) {
		departmentManagerContext.find(did);
	}
	
	public Collection<Department> getAllDepartment() {
		return departmentManagerContext.getAllDepartments();
	}
	

}
