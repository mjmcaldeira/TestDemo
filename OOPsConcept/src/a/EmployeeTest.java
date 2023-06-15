package a;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		Employee emp5 = new Employee(104, "Toneka", 2000);
		
//		emp1.id=100; 									//we can't set value for variable because variable are private
//		emp1.name="lex";
//		emp1.salary=12000;
//		emp2.id=101;
//		emp2.name="steven";
//		emp2.salary=14000;
	
		emp1.setValue(100,  "Lex", -12000);
		emp2.setValue(101,  "Steven", 14000);
		emp3.setValue(102,  "Lokesh", 15000);
		emp4.setValue(103, "Mike", 18000);
		
		System.out.println("emp1 details are :");
		emp1.display();
		System.out.println("");
		
		
		System.out.println("emp2 details are :");
		emp2.display();
		System.out.println("");
		
		System.out.println("emp3 details are :");
		emp3.display();
		System.out.println("");
		
		System.out.println("emp4 details are :");
		emp4.display();
		System.out.println("");
		
		System.out.println("emp5 details are :");
		emp5.display();
		
		
	}

}
