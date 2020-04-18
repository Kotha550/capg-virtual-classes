package com.capg.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	
	private int employeeId=12345;
	
	private String employeeName="Manik";
	
	private double employeeSalary=40000;
	
	
	@Autowired
	private SBU bussinessUnit;
	
	
	public Employee()
	{
		
	}
	public Employee(int employeeId, String employeeName, double employeeSalary)
		
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		
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
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary+"]"; 
				
	}
	public void display()
	{
		System.out.println("Employee Details ");
		System.out.println("-------------------------------------------------");
		System.out.println("Employee ID           : "+employeeId);
		System.out.println("Employee Name         : "+employeeName);
		System.out.println("Employee Salary       : "+employeeSalary);
		
		
	}
	
	
	
}
