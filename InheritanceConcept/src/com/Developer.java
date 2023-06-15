package com;

public class Developer extends Employee {
private String tech;
	
	void setDeveloper(String tech) {
		this.tech = tech;
	}

	void disDeveloper()	{
//		System.out.println("Developer Information");
		System.out.println("Technology "+tech);
	}
}
