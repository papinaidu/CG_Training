import java.util.Scanner;
class Employee{
	String name;
	int salary;
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	void display(){
		System.out.println("Name of the employee: " + name);
		System.out.println("Employee Current salary: " + salary);
	}
}

public class EmployeeMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String  name = sc.next();
		System.out.println("Enter Employee salary:");
		int salary = sc.nextInt();
		Employee obj = new Employee(name, salary);
		obj.display();
	}
}