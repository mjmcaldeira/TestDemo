package a;

public class Employee {
	private int id;
	private String name;
	private float salary;                    			// property or instance variable
	
	Employee() {									// Explicit constructor (overrides default constructor)
		System.out.println("Object created...");
		id=123;
		name="Unknown";
		salary=5000;
	}
	
	Employee(int id1, String name1, float salary1) {	 //Parameter Constructor
		id=id1;
		name=name1;
		salary=salary1;
	}
		
	void setValue(int id1, String name1, float salary1) {	 //local variable
		id=id1;
		name=name1;
//		salary=salary1;
		if(salary1<0) {
			salary=8000;
		}else {
			salary = salary1;
		}
	}
	//method no passing parameter and no rturn type
	void display() { 							//behaviour or funtion or method
			System.out.println("id is "+id);
			System.out.println("name is "+name);
			System.out.println("salary is "+salary);
	}
}
