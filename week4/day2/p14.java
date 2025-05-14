public class Main  {
    public static void reverse(Queue<Integer> queue){
       if(queue.isEmpty()){
           return;
       }
       int front = queue.remove();
       reverse(queue);
       queue.add(front);
   }
   public static void main(String[] args) {
      Queue<Integer> queue = new LinkedList<>(Arrays.asList(1,2,3,4));
       reverse(queue);
       System.out.println(queue);
   }
}