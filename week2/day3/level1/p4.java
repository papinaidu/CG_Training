class Student{
	private final int rollNumber;
	private String name;
	private double CGPA;
	static int totalStud;
	static String universityName = "SRMIST";
	Student(String name, int rollNumber, double CGPA){
		this.name = name;
		this.rollNumber=rollNumber;
		this.CGPA = CGPA;
		totalStud++;
	}
	void displayTotalStudents(){
		System.out.println("Total Students: " + totalStud);
	}
	void displayStudent() {
        	System.out.println("Roll Number: " + rollNumber);
        	System.out.println("Name: " + name);
        	System.out.println("CGPA: " + CGPA);
   	}
	
}

public class staticStudentMain {
	public static void main(String[] args){
		Student obj = new Student("anil", 40, 8.0);
		if (obj instanceof Student) {
            		System.out.println("obj is Instance of Student");
        	}
		obj.displayStudent();
		obj.displayTotalStudents();
		Student obj1 = new Student("nani", 42, 9.0);
		if (obj1 instanceof Student) {
            		System.out.println("obj is Instance of Student");
        	}
		obj1.displayStudent();
		obj1.displayTotalStudents();

	}
}