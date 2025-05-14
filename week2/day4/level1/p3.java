import java.util.ArrayList;

class Company {
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department department) {
        departments.add(department);
    }

    void showDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.showEmployees();
        }
    }

   
    protected void finalize() throws Throwable {
        System.out.println("Deleting company: " + companyName);
        for (Department department : departments) {
            department.deleteEmployees();
        }
        super.finalize();
    }
}

class Department {
    String departmentName;
    ArrayList<Employee> employees;

    Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    void showEmployees() {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }

    void deleteEmployees() {
        employees.clear();
        System.out.println("Employees deleted from department: " + departmentName);
    }
}

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Employee: " + name + " | ID: " + id);
    }
}

public class CompanySystem {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department department1 = new Department("Engineering");
        department1.addEmployee(new Employee("Alice", 101));
        department1.addEmployee(new Employee("Bob", 102));

        Department department2 = new Department("HR");
        department2.addEmployee(new Employee("Charlie", 201));
        department2.addEmployee(new Employee("Diana", 202));

        company.addDepartment(department1);
        company.addDepartment(department2);

        company.showDetails();
        
        company = null;  // Simulating the deletion of the company
        System.gc();     // Suggesting garbage collection to trigger finalize() method
    }
}