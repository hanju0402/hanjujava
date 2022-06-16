package com.kt.emp;

// 경영
public class Management implements EmployeeRole {

	private String name;
	
	public Management(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void work() {
		
	}

}
