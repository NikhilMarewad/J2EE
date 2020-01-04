package com.cognizant.servlet.modal;

public class Employee4 {

	private int employeeId;
	private String employeeName;
	private String gender;
	private String employeedob;
	private boolean fullEmployee;
	public Employee4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee4(int employeeId, String employeeName, String gender, String employeedob, boolean fullEmployee) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.employeedob = employeedob;
		this.fullEmployee = fullEmployee;
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
	public boolean isFullEmployee() {
		return fullEmployee;
	}
	public void setFullEmployee(boolean fullEmployee) {
		this.fullEmployee = fullEmployee;
	}
	
}
