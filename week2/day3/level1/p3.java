class Employee{

	private String name;
	private final int id;
	private String designation;
	static int totalemp;
	static String companyName = "Capgemini";
	Employee(String name, int id, String designation){
		this.name = name;
		this.id=id;
		this.designation = designation;
		totalemp++;
	}
	void displayTotalEmployees(){
		System.out.println("Total Employees: " + totalemp);
	}
	void displayEmployees() {
		System.out.println("company Name: " + companyName);
        	System.out.println("ID: " + id);
        	System.out.println("Name: " + name);
        	System.out.println("Designation: " + designation);
   	}
	
}

public class staticEmployeeMain {
	public static void main(String[] args){
		Employee obj = new Employee("anil", 40, "HR");
		if (obj instanceof Employee) {
            		System.out.println("obj is Instance of Employee");
        	}
		obj.displayEmployees();
		obj.displayTotalEmployees();
		Employee obj1 = new Employee("nani", 42, "TL");
		if (obj1 instanceof Employee) {
            		System.out.println("obj is Instance of Employee");
        	}
		obj1.displayEmployees();
		obj1.displayTotalEmployees();

	}
}