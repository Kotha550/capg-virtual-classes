package com.capg.lab1;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("sbu")
public class SBU {

	private int sbuId=123;
	private String sbuName="Product Engineering Services";
	private String sbuHead="Rohith";
	
	Employee emp1=new Employee(1234, "Rohith",40000);
	Employee emp2=new Employee(1235, "Nived",50000);
	Employee emp3=new Employee(1236, "Raju",60000);
	
	
	private List<Employee> empList=Arrays.asList(emp1,emp2,emp3);
	
	public SBU() {
		super();
	}
	public SBU(int sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
	public void display()
	{
		System.out.println("SBU Details ");
		System.out.println("-------------------------------------------------");
		System.out.println("SBU ID           : "+sbuId);
		System.out.println("SBU Name         : "+sbuName);
		System.out.println("SBU Head         : "+sbuHead);
		System.out.println("Employee Details ");
		System.out.println("-------------------------------------------------");
		System.out.println("Employeee        :"+empList);
	}
	
	
}
