class Employee{
	String name;
	int id;
	int salary;
	Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void displayDetails(){
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Salary: " + salary);

	}
}
class Manager extends Employee{
	Manager(String name, int id, int salary){
		super(name, id, salary);
	}
	int teamSize;
}
class Developer extends Employee{
	String programmingLanguage;
	Developer(String name, int id, int salary){	
		super(name, id, salary);
	}
}
class Intern extends Employee{
	int numOfMonths;
	Intern(String name, int id, int salary){
		super(name, id, salary);
	}
}
public class EmployeeMainoops {
	public static void main(String[] args){
		Employee e = new Employee("naidu", 34, 10000);
		Manager m = new Manager("naidu", 34, 10000);
		Developer d = new Developer("naidu", 34, 10000);
		Intern i = new Intern("naidu", 34, 10000);
		e.displayDetails();
	}
}