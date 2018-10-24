package com.cg.one.service;

public class Employee extends  SBUDetails{
	
	int employeeId;
	String employeeName;
	double salary;
	String businessUnit;
	int age;



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



	public String getBusinessUnit() {
		return businessUnit;
	}



	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void display(){
		System.out.println("Employee Details:");
		System.out.println("-------------------------");
		System.out.println("Employee ID : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+salary);
		//System.out.println("Employee BU : "+businessUnit);
		System.out.println("Employee Age : "+age);
		System.out.println();
		
	}
	public void getSBUDetails(){
		
		SBUDetails s=new SBUDetails(sbuId, sbuName, sbuHead);
		s.display1();
	}
	

}
