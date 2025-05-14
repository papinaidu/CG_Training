import java.util.ArrayList;

class University {
    String universityName;
    ArrayList<Department> departments;

    University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department department) {
        departments.add(department);
    }

    void showDetails() {
        System.out.println("University: " + universityName);
        for (Department department : departments) {
            department.showFaculty();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Deleting university: " + universityName);
        for (Department department : departments) {
            department.deleteFaculty();
        }
        super.finalize();
    }
}

class Department {
    String departmentName;
    ArrayList<Faculty> facultyMembers;

    Department(String departmentName) {
        this.departmentName = departmentName;
        facultyMembers = new ArrayList<>();
    }

    void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    void showFaculty() {
        System.out.println("Department: " + departmentName);
        for (Faculty faculty : facultyMembers) {
            faculty.showDetails();
        }
    }

    void deleteFaculty() {
        facultyMembers.clear();
        System.out.println("Faculty members deleted from department: " + departmentName);
    }
}

class Faculty {
    String name;
    int id;

    Faculty(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Faculty: " + name + " | ID: " + id);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        University university = new University("Tech University");

        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mechanical Engineering");

        Faculty faculty1 = new Faculty("Dr. Smith", 101);
        Faculty faculty2 = new Faculty("Dr. Johnson", 102);
        Faculty faculty3 = new Faculty("Dr. Brown", 103);

        department1.addFaculty(faculty1);
        department1.addFaculty(faculty2);
        department2.addFaculty(faculty3);

        university.addDepartment(department1);
        university.addDepartment(department2);

        university.showDetails();

       
    }
}