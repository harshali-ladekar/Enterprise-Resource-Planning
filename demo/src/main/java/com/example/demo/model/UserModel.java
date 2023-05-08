package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class UserModel {
    @Id
	private Integer id;
	private String name;
	private String address;
	private String salary;
	private String department;
	
	public UserModel() {
		super();
	}

	public UserModel(Integer id, String name, String address, String salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
