import java.io.*;
class Employee implements Serializable {
   int id;
   String name;
   String department;
   int salary;
   Employee(int id, String name, String department, int salary){
       this.id = id;
       this.name = name;
       this.department = department;
       this.salary = salary;
   }
}
public class Main {
   public static void main(String[] args)  {
       try {
           FileOutputStream fos = new FileOutputStream("Employee.ser");
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           Employee emp = new Employee(122,"Ashok", "CS",30000);

           oos.writeObject(emp);

           FileInputStream fis = new FileInputStream("Employee.ser");
           ObjectInputStream ois = new ObjectInputStream(fis);

           Employee e = (Employee) ois.readObject();
           ois.close();
           fis.close();
           System.out.println("Employee Name: " + e.name + "\nEmployee ID: " + e.id + "\nDepartment: " + e.department + "\nSalary: " + e.salary);
       }
       catch (IOException e){
           System.out.println("Error: " + e.getMessage());
       } catch (ClassNotFoundException e) {
           System.out.println("Class Not Found: " + e.getMessage());
       }


   }
}