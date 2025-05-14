public class Main {
   public static void main(String[] args) {
       HashSet<Integer> set = new HashSet<>();
       set.add(100);
       set.add(4);
       set.add(5);
       set.add(200);
       set.add(9);
       set.add(3);
       set.add(2);
       int count =0;
       int next;
       int max = Integer.MIN_VALUE;
       for(int num : set) {

           if(set.contains((num-1))) {
               int current = num;
               count = 1;
               while (set.contains(current)){
                   current++;
                   count++;
               }
               max = Math.max(max, count);
           }
       }
       System.out.println("Maximum Longest Consecutive Sequence is " + max);
   }
}