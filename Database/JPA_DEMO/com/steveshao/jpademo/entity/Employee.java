package com.steveshao.jpademo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(query = "Select e from Employee e", name = "find all employees")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private double salary;
	private String deg;
	@ManyToOne
	private Department department;

	public Employee() {
		
	}
	 	public Employee(int eid, String ename, double salary, String deg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}
	
	public String getDeg() {
		return deg;
	}
	
	public void setDeg(String deg) {
		this.deg = deg;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String geteName() {
		return ename;
	}
	
	public void seteName(String eName) {
		this.ename = eName;
	}
	
	public int geteId() {
		return eid;
	}
	
	public void seteId(int eId) {
		this.eid = eId;
	}
	public Department getDepartment() {
	      return department;
	   }

	public void setDepartment(Department department) {
      this.department = department;
    }
	@Override
	public String toString() {
      return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + "]";
	}
	
}
