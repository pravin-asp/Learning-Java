public class employeeClass{
	public static void main(String[] args){
		Employee e1 = new Employee("Pravin", 22, 1000, "Tamil Nadu");
		System.out.println(e1.raiseSalary());
		
		System.out.println(Employee.employeeAge);
	}
}