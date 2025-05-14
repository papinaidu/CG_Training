class StudentList{
   int RollNumber;
   String Name;
   int Age;
   char Grade;
   StudentList next;

   StudentList(int RollNumber, String Name, int Age, char Grade){
       this.RollNumber = RollNumber;
       this.Name = Name;
       this.Age = Age;
       this.Grade = Grade;
       this.next = null;
   }
}

class StudentLL{
   private StudentList head;
   void addNodeAtEnd(int RollNumber, String Name, int Age, char Grade){
       StudentList node = new StudentList(RollNumber, Name, Age, Grade);
       if(head == null){
           head = node;
           return;
       }
       StudentList current = head;
       if(head.next == null){
           head.next = node;
           return;
       }
       while (current.next != null){
           current = current.next;
       }
       current.next = node;
   }
   void addNodeAtBeginning(int RollNumber, String Name, int Age, char Grade){
       StudentList node = new StudentList(RollNumber, Name, Age, Grade);
       node.next = head;
       head = node;
   }
   void DeleteNodeByValue(int RollNumber) {
       if(head == null){
           return;
       }
       if(head.RollNumber == RollNumber ){
           head = head.next;
           return;
       }
       StudentList current = head;
       while (current.RollNumber != RollNumber){
           current = current.next;
       }
       if(current.next != null){
           current.next = current.next.next;
       }

   }
   void SearchStudentByRollNumber(int RollNumber){
       if(head == null){
           return;
       }
       if(head.RollNumber == RollNumber){
           printOutput();
       }
       StudentList current = head;
       while(current.RollNumber != RollNumber){
           current = current.next;
       }
       printOutput();
   }
   void display(){
       StudentList current = head;
       while(current != null){
           printOutput();
           current = current.next;
       }
   }
   void printOutput(){
       StudentList current = head;
       System.out.print(current.RollNumber + " -> ");
       System.out.print(current.Name + " -> ");
       System.out.print(current.Age + " -> ");
       System.out.print(current.Grade + " -> ");
       System.out.print("Null");
       System.out.println();
   }
}


public class Main  {
   public static void main(String[] args) {
       StudentLL s1 = new StudentLL();
       s1.addNodeAtEnd(1, "Ravi", 15, 'A');
       s1.addNodeAtEnd(2, "Raju", 14, 'B');
       s1.addNodeAtEnd(3, "Ramu", 16, 'C');
       s1.addNodeAtEnd(4, "Ram", 17, 'D');

       s1.display();
       System.out.println();
       s1.SearchStudentByRollNumber(1);

   }
}