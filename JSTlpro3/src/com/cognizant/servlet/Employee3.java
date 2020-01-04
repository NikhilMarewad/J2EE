package com.cognizant.servlet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee3 {
	
	
	private int employeeId;
	private String employeeName;
	private String gender;
	private String employeedob;
	
	
	public Employee3(int employeeId, String employeeName, String gender, String employeedob) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.employeedob = employeedob;
	}
	public Employee3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmployeedob() {
		return employeedob;
	}
	public void setEmployeedob(String employeedob) {
		this.employeedob = employeedob;
	}

	
	
}
