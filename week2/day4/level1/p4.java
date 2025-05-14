import java.util.ArrayList;

class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showAllStudents() {
        System.out.println("School: " + schoolName);
        for (Student student : students) {
            student.showEnrolledCourses();
        }
    }
}

class Student {
    String name;
    int id;
    ArrayList<Course> courses;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
        courses = new ArrayList<>();
    }

    void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void showEnrolledCourses() {
        System.out.println("Student: " + name + " | ID: " + id);
        System.out.println("Enrolled in: ");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

class Course {
    String courseName;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    String getCourseName() {
        return courseName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student student1 = new Student("John", 101);
        Student student2 = new Student("Alice", 102);

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        school.addStudent(student1);
        school.addStudent(student2);

        school.showAllStudents();

        course1.showEnrolledStudents();
        course2.showEnrolledStudents();
    }
}