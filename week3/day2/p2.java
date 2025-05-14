public class Main {
   static void sortStack(Stack<Integer> stack) {
       if (!stack.isEmpty()) {
           int  val = stack.pop();
           sortStack(stack);
           InsertSort(stack, val);
       }
   }
   static void InsertSort(Stack<Integer> stack, int val) {
       if (stack.isEmpty() || val >= stack.peek()) {
           stack.push(val);
           return;
       }
       int temp =  stack.pop();
       InsertSort(stack, val);
       stack.push(temp);
   }
   public static void main(String[] args) {
       Stack<Integer> stack = new Stack<>();
       stack.push(4);
       stack.push(8);
       stack.push(5);
       stack.push(3);
       stack.push(1);
       System.out.print(stack);
       sortStack(stack);
       System.out.print(stack);
   }
}