class Person {
   String name;
   int age;

   Person(String name, int age) {
       this.name = name;
       this.age = age;
   }

   void displayDetails() {
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
   }
}

class Teacher extends Person {
   String subject;

   Teacher(String name, int age, String subject) {
       super(name, age);
       this.subject = subject;
   }

   void displayRole() {
       System.out.println("Role: Teacher");
       displayDetails();
       System.out.println("Subject: " + subject);
   }
}

class Student extends Person {
   int grade;

   Student(String name, int age, int grade) {
       super(name, age);
       this.grade = grade;
   }

   void displayRole() {
       System.out.println("Role: Student");
       displayDetails();
       System.out.println("Grade: " + grade);
   }
}

class Staff extends Person {
   String department;

   Staff(String name, int age, String department) {
       super(name, age);
       this.department = department;
   }

   void displayRole() {
       System.out.println("Role: Staff");
       displayDetails();
       System.out.println("Department: " + department);
   }
}

public class Main {
   public static void main(String[] args) {
       Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
       Student s = new Student("Anya", 16, 10);
       Staff st = new Staff("Ravi", 35, "Administration");

       t.displayRole();
       System.out.println();
       s.displayRole();
       System.out.println();
       st.displayRole();
   }
}