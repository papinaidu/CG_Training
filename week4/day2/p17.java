import java.util.*;
class StackUsingQueues {
   Queue<Integer> q1 = new LinkedList<>();
   Queue<Integer> q2 = new LinkedList<>();

   void push(int x){
       q2.add(x);
       while (!q1.isEmpty()){
           q2.add(q1.remove());
       }
       Queue<Integer> temp = q2;
       q2 = q1;
       q1 = temp;
   }
   int peek(){
       if(q1.isEmpty()) throw new NoSuchElementException("Stack is empty");
       return q1.peek();
   }
   int pop(){
       if(q1.isEmpty()) throw new NoSuchElementException("Stack is empty");
       return q1.remove();
   }

}
public class Main  {
   public static void main(String[] args) {
       StackUsingQueues obj = new StackUsingQueues();
       obj.push(1);
       obj.push(2);
       obj.push(3);
       obj.push(4);
       obj.push(5);

       System.out.println(obj.pop());
   }
}