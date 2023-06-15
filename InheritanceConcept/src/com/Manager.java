package com;

public class Manager extends Employee {
private int numberOfEmp;

	void setManager(int numberOfEmp) {
		this.numberOfEmp=numberOfEmp;
	}
	
	void disManager()	{
//		System.out.println("Manager Information ");
		System.out.println("The number of employee is "+this.numberOfEmp);
	}
}
