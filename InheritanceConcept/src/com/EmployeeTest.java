package com;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println("This is Employee details");
		Employee emp1=new Employee();
		emp1.setEmployee(100, "Steven",15000);
		emp1.disEmployee();
		System.out.println("==============================");
		
		System.out.println("==============================");
		System.out.println("This is Manager details");
		Manager mgr1=new Manager();
		mgr1.setEmployee(101, "Lex",45000);
		mgr1.setManager(15);
		mgr1.disManager();
		mgr1.disEmployee();
		System.out.println("==============================");
		
		System.out.println("==============================");
		System.out.println("This is Developer details");
		Developer dev1=new Developer();
		dev1.setEmployee(102, "Toneka", 20000);
		dev1.setDeveloper("Java Tech");
		dev1.disDeveloper();
		dev1.disEmployee();
		System.out.println("==============================");

	}

}
