import java.util.*;
class Patient{
   String name;
   int severity;
   Patient(String name, int severity){
       this.name = name;
       this.severity = severity;
   }
   public String toString(){
       return name + " " + severity;
   }
}
public class Main  {

   public static void main(String[] args) {
       Queue<Patient> obj = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));
       obj.add(new Patient("John",3));
       obj.add(new Patient("Alice",5));
       obj.add(new Patient("Bob",2));
       while (!obj.isEmpty()){
           System.out.println(obj.remove());
       }
   }
}