class TSNode{
   TSNode next;
   int TaskID;
   String TaskName;
   int Priority;
   String DueDate;
   TSNode(int TaskID, String TaskName, int Priority, String DueDate){
       this.TaskID = TaskID;
       this.TaskName = TaskName;
       this.Priority = Priority;
       this.DueDate = DueDate;
   }
}
class TSLinkedList{
   TSNode head;
   TSNode tail;
   TSNode currentTask;
   void addNodeAtBeginning(int TaskID, String TaskName, int Priority, String DueDate){
       TSNode node = new TSNode(TaskID, TaskName, Priority, DueDate);
       if(head == null){
           node.next = node;
           head = node;
           tail = node;
           return;
       }
       node.next = head;
       head = node;
       tail.next = head;

   }
   void addNodeAtEnd(int TaskID, String TaskName, int Priority, String DueDate){
       TSNode node = new TSNode(TaskID, TaskName, Priority, DueDate);
       if(head == null){
           head = node;
           tail = node;
           node.next = tail;
           return;
       }
       tail.next = node;
       tail = node;
       tail.next = head;
   }
   void addNodeAtPosition(int TaskID, String TaskName, int Priority, String DueDate, int Position){
       TSNode node = new TSNode(TaskID, TaskName, Priority, DueDate);
       if(Position < 1){
           System.out.print("Invalid Position");
       }
       if(head == null && Position == 1){
           head = node;
           tail = node;
           node.next = tail;
           return;
       }else if( Position == 1){
           node.next = head;
           head = node;
           tail.next = head;
       }
       TSNode current = head;
       int count = 1;
       if(current == null) return;
       while( count < Position-1 && current.next != head){
           current = current.next;
       }
       node.next = current.next;
       if(current.next != null){
           current.next = node;
       }
       if (current == tail) {
           tail = node;
       }
   }
   void deleteNodeByValue(int TaskID) {
       if (head == null) return;

       // Case 1: Only one node in the list
       if (head == tail && head.TaskID == TaskID) {
           head = null;
           tail = null;
           return;
       }

       TSNode current = head;
       TSNode prev = tail;

       do {
           if (current.TaskID == TaskID) {

               if (current == head) {
                   head = head.next;
                   tail.next = head;
               }

               else if (current == tail) {
                   tail = prev;
                   tail.next = head;
               }

               else {
                   prev.next = current.next;
               }
               return;
           }

           prev = current;
           current = current.next;
       } while (current != head);

       System.out.println("Task ID " + TaskID + " not found.");
   }
   void SearchByValue(int Priority){
       if(head == null){
           System.out.println("List is empty.");
           return;
       }

       TSNode current = head;
       boolean found = false;

       do{
           if(current.Priority == Priority){
               printOut(current);
               System.out.println();
               found = true;
           }
           current = current.next;
       }while (current != head);
       if (!found) {
           System.out.println("No task found with Priority " + Priority + ".");
       } else {
           System.out.println("(end of matching tasks)");
       }
   }
   void display(){
       if(head == null){
           System.out.println("List is empty.");
           return;
       }

       TSNode current = head;
       do{
           printOut(current);
           current = current.next;
       }while (current != head);
   }
   void viewAndMoveToNext() {

       if (head == null) {
           System.out.println("No tasks available.");
           return;
       }

       if (currentTask == null) {
           currentTask = head;
       }

       printOut(currentTask); // Show current task
       currentTask = currentTask.next; // Move to next for next call
   }
   void printOut(TSNode node){
       System.out.print(node.TaskID + " -> ");
       System.out.print(node.TaskName + " -> ");
       System.out.print(node.Priority + " -> ");
       System.out.print(node.DueDate + " -> ");
       System.out.print("null");
       System.out.println();
   }
}
public class Main {
   public static void main(String[] args) {
       TSLinkedList scheduler = new TSLinkedList();


       scheduler.addNodeAtBeginning(1, "Design Module", 2, "2025-04-15");
       scheduler.addNodeAtBeginning(2, "Code Review", 1, "2025-04-14");

       scheduler.addNodeAtEnd(3, "Testing", 3, "2025-04-18");

       scheduler.addNodeAtPosition(4, "Documentation", 2, "2025-04-16", 2);

       System.out.println("All Tasks:");
       scheduler.display();

       System.out.println("\nViewing tasks one by one:");
       scheduler.viewAndMoveToNext();
       scheduler.viewAndMoveToNext();
       scheduler.viewAndMoveToNext();

       System.out.println("\nSearching tasks with Priority = 2:");
       scheduler.SearchByValue(2);

       System.out.println("\nDeleting Task ID 2");
       scheduler.deleteNodeByValue(2);

       System.out.println("\nAll Tasks after deletion:");
       scheduler.display();
   }
}