public class Employee{
	String name;
	int age, salary;
	String location;
	static int employeeAge = 18;
	
	Employee(String name, int age, int salary, String location){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.location = location;
	}
	
	int raiseSalary(){
		this.salary += 1000;
		return salary;
	}
	
}