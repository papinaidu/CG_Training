class Node {
   int data;
   Node next;
   Node(int data){
       this.data = data;
       this.next = null;
   }
}


class Stack {
   Node top;
   void push(int data){
       Node newNode = new Node(data);
       newNode.next = top;
       top = newNode;
   }
   int pop(){
       if(top == null){
           System.out.println("Stack is empty.");
           return -1;
       }
       int popData = (top.data);
       top = top.next;
       return popData;
   }
   int peek(){
       if(top == null){
           System.out.println("Stack is empty.");
           return -1;
       }
       return top.data;
   }
   boolean isEmpty(){
       return top == null;
   }

}


public class Main {
   public static void main(String[] args) {
       Stack stack1 = new Stack();
       Stack stack2 = new Stack();

       stack1.push(1);
       stack1.push(2);
       stack1.push(3);
       stack1.push(4);
       stack1.push(5);
       stack1.push(6);
       stack1.push(7);
       stack1.push(8);

       while (!stack1.isEmpty()){
           stack2.push(stack1.pop());
       }
       while (!stack2.isEmpty()){
           System.out.print(stack2.pop() + " -> ");
       }
       System.out.print("Null");
       System.out.println();
   }
}