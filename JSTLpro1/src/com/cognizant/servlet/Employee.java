package com.cognizant.servlet;

public class Employee {

	private long EmployeeId;
	private String EmployeeName;

	public Employee(long employeeId, String employeeName) {
		super();
		this.EmployeeId = employeeId;
		this.EmployeeName = employeeName;

	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(long employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

}
