package com.nt.domain;

import java.io.Serializable;

public class Employee implements Serializable {
	private int eid;
	private String firstName;
	private String lastName;
	private Float salary;
	
	public Employee() {
	  System.out.println("Employee:0-param constructor");
	}
	
	public int getEid() {
		
		return eid;
	}
	public void setEid(int eid) {
		
		this.eid = eid;
	}
	public String getFirstName() {
		
		return firstName;
	}
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	public String getLastName() {
		
		return lastName;
	}
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	public Float getSalary() {
		
		return salary;
	}
	public void setSalary(Float salary) {
		
		this.salary = salary;
	}

}
