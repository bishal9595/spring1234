package com.cg.iocdemo1;

import java.util.List;

public class Employee {
private int employeeId;
private String employeeName;
private double salary;
private SBU businessUnit;
private int age;

public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(int employeeId, String employeeName, double salary, SBU businessUnit, int age) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary = salary;
	this.businessUnit = businessUnit;
	this.age = age;
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

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public SBU getBusinessUnit() {
	return businessUnit;
}

public void setBusinessUnit(SBU businessUnit) {
	this.businessUnit = businessUnit;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


public SBU getSbuDetails() {
	return businessUnit;
}


@Override
public String toString() {
	return "Employee [employeeId = " + employeeId + ", employeeName = " + employeeName + ", salary = " + salary
			+  ", age = " + age +",\nsbu details = " + businessUnit.toString()  +"]";
}




	
	
	
}
